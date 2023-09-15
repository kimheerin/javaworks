package whileexample;

import java.util.Scanner;

public class CoffeMachine {

	public static void main(String[] args) {
		// 커피 자동판매기 구현 프로그램
		// 커피 총 개수 - 5
		// 커피값은 500
		// 500원을 초과하면 거스름돈과 커피가 나옴
		// 500원이 부족하면 커피 안 나옴
		// 커피가 다 떨어지면 "판매 중단" 출력 - 프로그램 종료
		Scanner sc = new Scanner(System.in);
		int coffee = 5;
		
		while(true) {
			System.out.print("\n돈을 넣어 주세요 : ");
			int money = sc.nextInt(); //돈 입력
			
			if(money == 500) {
				System.out.println("\n커피가 나옵니다.");
				coffee -= 1; //coffee = coffee - 1
			}else if(money > 500) {
				System.out.println("\n" + (money - 500) + "원이 반한되고, 커피가 나옵니다.");
				coffee -= 1;
			}else {
				System.out.println("\n커피가 나오지 않습니다.");
			}
			System.out.println("잔여 커피는 " + coffee + "개입니다." );
			
			if(coffee == 0) {
				System.out.println("\n커피가 모두 소진되었습니다. \n판매를 종료합니다.");
			}
		}//while 끝

	}

}
