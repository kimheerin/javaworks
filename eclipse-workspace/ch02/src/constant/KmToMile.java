package constant;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		//km로 입력 mile로 출력
		//변환상수 : 1mile = 1.609344km
		//변수 - kgh, mph
		Scanner scanner = new Scanner(System.in);
		
		final double RATE_KPH_MPM = 1.609344;
		double mph = 0.0;
		
		System.out.print("구속을 입력하세요. : ");
		double kph = scanner.nextDouble();	//실수형 0.0 초기화

		
		//연산
		//mile = km / 변환상수
		mph = kph / RATE_KPH_MPM;
		
		//출력
		System.out.printf("공의 속도는 %f입니다.", mph);
		scanner.close();

	}

}
