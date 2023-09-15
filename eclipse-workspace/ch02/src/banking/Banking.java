package banking;

import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 은행 업무
		// 1.예금 2.출금 3.잔고(balance) 4.종료
		// 메뉴 화면 만들기
		// 출금액 > 잔고 "잔액이 부족합니다."
		Scanner scan = new Scanner(System.in);
		
		int balance = 0;					//잔고
		boolean sw = true;					//★상태변수 참,거짓 자료형
		

		while(sw) {
		System.out.println("============================");
		System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
		System.out.println("============================");
		
			int selNum = scan.nextInt();	// 메뉴 번호 입력
			int money = 0;; //입금출금액
		
			switch(selNum) {
			case 1:
				System.out.print("예금액(원) > ");			
				money += scan.nextInt();
				balance += money;
				System.out.println("정상적으로 입금되었습니다.\n");
				break;
			case 2:
				System.out.print("출금액(원) > ");
				money += scan.nextInt();
				if(balance < money) {
					System.out.println("잔액이 부족합니다.");
				}else {
					balance -= money;
				}
				System.out.println("정상적으로 출금되었습니다.\n");
				break;
			case 3:
				System.out.println("잔고액(원) > " + balance);
				break;				
			case 4:
				sw = false;					//(★상태변수 참,거짓 자료형) 상태줄 바꿈 while문 종료
				break;
			default:
				System.out.println("지원되지 않는 기능입니다.");
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}//main

}//class
