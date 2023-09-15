package input;

import java.util.Scanner;

public class BonusPointTest {

	public static void main(String[] args) {
		// 고객의 이름, 구매 금액을 입력
		// 이름 및 구매포인트 출력
		// 구매포인트(bonusPoint) = 상품 가격(price) * 보너스 적립율(bonusRatio)
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("고객의 이름을 입력하시오. : ");	//사용자 - 이름 임력
		String customer = sc.nextLine();
		
		System.out.print("구매 금액을 입력하시오. : ");
		int price = sc.nextInt();	//사용자 - 금액 입력
		
		double bonusRatio = 0.02;
		int bonusPoint = 0;
		
		//계산 처리
		bonusPoint = (int)(price * bonusRatio); //실수형을 정수형으로 형 변환
		
		
		//출력
		System.out.println(customer + "님의 보너스 포인트 " + bonusPoint + "점");
		
		sc.close();
		
		
		
		
		
	}

}
