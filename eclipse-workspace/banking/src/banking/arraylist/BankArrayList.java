package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import banking.array.Account;

public class BankArrayList {
	//통장 계좌를 저장할 자료 구조 객체 생성
	static List<Account> accountList = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean sw = true;
				
		while(sw) {
			try {
				System.out.println("================================================");
				System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
				System.out.println("================================================");
				System.out.print("선택 >>>>> ");
			
				//메뉴 선택
				int selecNo = Integer.parseInt(sc.nextLine()); 	//그냥 sc.nextLine 쓰면 오류남
				
				if(selecNo == 1) {
					creatAccount();			//계좌 생성
				}else if(selecNo == 2) {
					getAccountList();		//계좌 목록
				}else if(selecNo == 3) {
					deposit();				//예금
				}else if(selecNo == 4) {
					withdraw();			//출금
				}else if(selecNo == 5) {
					sw = false;				//종료
				}else {
					System.out.println("지원하지 않는 기능입니다. 다시 입력해 주세요.");
				}
			}catch(NumberFormatException e) {
					System.out.println("숫자를 선택해 주세요.");
			}//try
		}//while
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}//main
	
	private static void creatAccount() {
		System.out.println("------------------------------------------------");
		System.out.println("\t\t계좌 생성 시작");
		System.out.println("------------------------------------------------");
		
		while(true) {
			System.out.print("계좌번호 : ");
			String ano = sc.nextLine();
			//중복 계좌가 있는지 확인
			if(findAccount(ano) != null) {	//중복 계좌가 있으면
				System.out.println("중복 계좌입니다. 다시 입력해 주세요.");
			}else {	//중복 계좌가 없으면
				System.out.print("예금주 : ");
				String owner = sc.nextLine();
				
				System.out.print("초기 입금액 : ");
				int balance = Integer.parseInt(sc.nextLine());
				
				//입력한 내용을 매개변수로 계좌 생성
				Account newAccount = new Account(ano, owner, balance);
				accountList.add(newAccount);	//리스트에 저장
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}//while
	}//creatAccount
	
	private static void getAccountList() {
		System.out.println("------------------------------------------------");
		System.out.println("\t\t계좌 목록 조회");
		System.out.println("------------------------------------------------");
		
		for(int i=0; i<accountList.size(); i++) {
			Account account = (accountList.get(i)); 
				System.out.print("계좌 번호 : " + account.getAno() + "\t");
				System.out.print("예금주 : " + account.getowner() + "\t");
				System.out.println("잔고 : " + account.getbalance() + "\t");
		}

	}
	private static void deposit() {
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
			
				account.setbalance(account.getbalance() + money); 
				System.out.println("정상적으로 입금되었습니다!");
				break;
			}else {
				System.out.println("계좌가 존재하지 않습니다.");
			}
		}//while
	}//deposit
	
	private static void withdraw() {
		System.out.println("------------------------------------------------");
		System.out.print("\t\t   출    금\n");
		System.out.println("------------------------------------------------");
		
		while(true) {
			System.out.print("계좌 번호 : ");
			String ano = sc.nextLine();	
			
			if(findAccount(ano) != null) {								//null이 아닐 때	
				while(true) {
					System.out.print("출금액 : ");
					int money = Integer.parseInt(sc.nextLine());
				
					Account account = findAccount(ano);					
					if(money > account.getbalance()) {					//출금액이 잔고보다 작으면
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
					account.setbalance(account.getbalance() - money); 	
					System.out.println("정상적으로 출금되었습니다!");
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
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountList.size(); i++) {
			//이미 등록된 계좌를 가져와서
			//외부에서 입력한 계좌와 일치하는지 비교
			String dbAno = accountList.get(i).getAno();
			if(dbAno.equals(ano)); {
				account = accountList.get(i);	//계좌 객체 생성
				break;
			}
		}	
		return account;
	}

}//class
