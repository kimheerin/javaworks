package banking.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.common.JDBCUtil;

//Account를 생성, 조회, 수정, 삭제하는 클래스
//DAO - Data Access Object
public class AccountDAO {
	Connection conn; //db 연결 객체 선언
	PreparedStatement pstmt; //SQL 처리 객체
	ResultSet rs; //데이터셋 객체
	
	Scanner sc = new Scanner(System.in);
	
	public void creatAccount() {
		System.out.println("------------------------------------------------");
		System.out.println("\t\t계좌 생성 시작");
		System.out.println("------------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호(##-##-###) : ");
			String ano = sc.nextLine();
			
			String regExp = "\\d{2}-\\d{2}-\\d{3}";
			boolean result = Pattern.matches(regExp, ano);
			
			if(result) {
				//중복 계좌가 있는지 확인
				if(findAccount(ano) != null) {	//중복 계좌가 있으면
					System.out.println("중복 계좌입니다. 다시 입력해 주세요.");
			
				}else {	//중복 계좌가 없으면
					while(true) {
						System.out.print("예금주 : ");
						String owner = sc.nextLine();
						
						regExp = "[a-zA-Z가-힣]+";	//영어 및 한글만
						result = Pattern.matches(regExp, owner);
						if(result) {
							System.out.print("초기 입금액 : ");
							int balance = Integer.parseInt(sc.nextLine());
							
							//DB 작업
							try {
								conn = JDBCUtil.getConnection();
								String sql = "INSERT INTO account (ano, owner, balance) "
											+ "VALUES (?, ?, ?)";
								pstmt = conn.prepareStatement(sql);
								//값 설정
								pstmt.setString(1, ano);
								pstmt.setString(2, owner);
								pstmt.setInt(3, balance);
								//SQL 실행
								pstmt.executeUpdate();
								System.out.println("계좌가 생성되었습니다.");
							} catch (SQLException e) {
								e.printStackTrace();
							} finally {
								JDBCUtil.close(conn, pstmt);
							}
							break;
						}else {
							System.out.println("[예금주] 한글 및 영문으로 입력해 주세요.");
						}
					}
				}
			}else {
				System.out.println("[예금주] 올바른 형식이 아닙니다. 다시 입력해 주세요.");
			}
		}//while
	}//creatAccount
	
	public void getAccountList() {
		System.out.println("------------------------------------------------");
		System.out.println("\t\t계좌 목록 조회");
		System.out.println("------------------------------------------------");
	
		//계좌를 저장할 accountList 생성
		List<Account> accountList = new ArrayList<>();
		
		//DB 작업
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account";
			pstmt = conn.prepareStatement(sql);
			//검색 처리
			rs = pstmt.executeQuery();
			while(rs.next()) { //다음 데이터가 있는 동안 반복
				//account 객체
				String ano = rs.getString("ano");	  //DB에서 가져온 ano
				String owner = rs.getString("owner"); //DB에서 가져온 owner
				int balance = rs.getInt("balance");	  //DB에서 가져온 balance
				Account account = new Account(ano, owner, balance);
				
				accountList.add(account);	//계좌를 리스트에 저장
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		
		
		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = (accountList.get(i)); 
				System.out.print("계좌 번호 : " + account.getAno() + "\t");
				System.out.print("예금주 : " + account.getowner() + "\t");
				System.out.println("잔고 : " + account.getbalance() + "\t");
		}
	}
	public void deposit() {
		System.out.println("------------------------------------------------");
		System.out.print("\t\t   입    금\n");
		System.out.println("------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = sc.nextLine();
			
			if(findAccount(ano) != null) {	
				Account account = findAccount(ano);
				System.out.print("입금액 : ");
				int money = Integer.parseInt(sc.nextLine());
				int balance = account.getbalance() + money;
				//DB 작업
			try {
				conn = JDBCUtil.getConnection();
				String sql = "UPDATE account SET balance = ? "
						+ " WHERE ano = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, balance);
				pstmt.setString(2, ano);
				//sql 실행
				pstmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("결과 : 정상 처리되었습니다.");
			break;
		}else {
			System.out.println("계좌가 존재하지 않습니다.");
			}
		}//while
	}//deposit
	
	public void withdraw() {
		System.out.println("------------------------------------------------");
		System.out.print("\t\t   출    금\n");
		System.out.println("------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = sc.nextLine();	
			
			if(findAccount(ano) != null) {								//null이 아닐 때	
				while(true) {
				Account account = findAccount(ano);
				System.out.print("출금액 : ");
				int money = Integer.parseInt(sc.nextLine());
				int balance = account.getbalance() - money;
				//DB 작업
				try {
					conn = JDBCUtil.getConnection();
					String sql = "UPDATE account SET balance = ? "
							+ " WHERE ano = ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setInt(1, balance);
					pstmt.setString(2, ano);
					//sql 실행
					pstmt.executeUpdate();

				} catch (SQLException e) {
					e.printStackTrace();
				}
	
				System.out.println("결과 : 정상 처리되었습니다.");
					if(money > account.getbalance()) {					//출금액이 잔고보다 작으면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
					account.setbalance(account.getbalance() - money); 	
					System.out.println("정상적으로 출금되었습니다.");
					break;
					}
				}
				break;
			}else{
				System.out.println("계좌가 존재하지 않습니다.");
			}
			break;
			
		}//while
	}//withdraw	
	
	//계좌 삭제
	  public void removeAccount() {
	      
		System.out.println("------------------------------------------------");
		System.out.print("\t\t   삭    제\n");
		System.out.println("------------------------------------------------");
	      
	      while(true) {
	         System.out.print("계좌 번호 : ");
	         String ano = sc.nextLine();
	         
	         if(findAccount(ano) !=null) { // 찾는 계좌가 없으면 
	
	        	 System.out.println("1. ok | 2. cancel");
	        	 String menuNo = sc.nextLine();
	        	 if(menuNo.equals("1")) {
		        //DB처리

	        	 try {
	        		 conn = JDBCUtil.getConnection();
		        	 String sql = "DELETE FROM account "
		        	 		+ "WHERE ano = ?";
		        	 //값 설정
	        		 pstmt = conn.prepareStatement(sql);
	        		 pstmt.setString(1, ano);
	        		 
	        		 //SQL 실행
	        		 pstmt.executeUpdate();
	 	        	 System.out.println("결과 : 정상 처리되었습니다.");

				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
	        	}else {
	        		System.out.println("삭제를 취소합니다.");
	        	}
	            break;
	         }else{            
	            System.out.println("계좌가 존재하지 않습니다. 다시 입력해 주세요.");
	         }         
	      }//whlie 끝
	   }
	public void selectAccount() {
		
		System.out.println("------------------------------------------------");
		System.out.print("\t\t   검    색\n");
		System.out.println("------------------------------------------------");
		
		
		while(true) {
	         System.out.print("계좌 번호 조회 : ");
	         String ano = sc.nextLine();
	         
	         if(findAccount(ano) !=null) { // 찾는 계좌가 없으면 
		           //db처리
               

		            break;
		         }else{            
		            System.out.println("계좌가 존재하지 않습니다. 다시 입력해 주세요.");
		         }         
		     }//whlie 끝
	}
	public Account findAccount(String ano) {
		Account account = null;
		//DB 처리
		try {
			conn = JDBCUtil.getConnection();
			String sql = "SELECT * FROM account WHERE ano = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			//1개 검색 처리
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner"); //DB에서 가져온 owner
				int balance = rs.getInt("balance");	  //DB에서 가져온 balance
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
}
