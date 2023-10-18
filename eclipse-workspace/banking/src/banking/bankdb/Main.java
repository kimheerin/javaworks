package banking.bankdb;

import java.util.Scanner;

import banking.domain.AccountDAO;
//AccountDAO
public class Main {

	public static void main(String[] args) {
		//AccountDAO의 객체 생성 - 메서드 사용 가능
		AccountDAO dao = new AccountDAO();
		Scanner sc = new Scanner(System.in);
		boolean sw = true;
		
		while(sw) {
			try {
				System.out.println("=========================================================================");
				System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 계좌 삭제 | 6. 계좌 검색 | 7. 종료");
				System.out.println("=========================================================================");
				System.out.print("선택 >>>>> ");
			
				//메뉴선택
	            int selectNo = Integer.parseInt(sc.nextLine());
	         
	            
	            if(selectNo ==1) {
	               dao.creatAccount();     //계좌 생성
	            }else if(selectNo ==2) {
	               dao.getAccountList();   // 계좌 목록
	            }else if(selectNo ==3) {
	               dao.deposit(); 			// 예금
	            }else if(selectNo ==4) {
	               dao.withdraw();   		// 출금
	            }else if(selectNo ==5) {
	               dao.removeAccount();  	 //계좌삭제
	            }else if(selectNo ==6) {
		           dao.selectAccount();   	 //계좌 검색   
	            }else if(selectNo ==7) {
	               sw =false;     		 //종료
	            }else{
	               System.out.println("지원하지 않는 기능입니다.");
	            }
	            }catch(NumberFormatException e){
	               //e.printStackTrace();
	               System.out.println("올바른 숫자를 선택해주세요");               
	            }
		}//while
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}//main
}//class
