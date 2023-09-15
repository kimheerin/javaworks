package ifexample;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		//입장객 수에 따른 좌석의 줄(행)수 계산
		//변수 - customer(관객수), column(열 수), row(줄 수)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("관객 수 입력 : ");
		int customer = scan.nextInt();
		
		System.out.print("열 수 입력 : ");
		int column = scan.nextInt();
		
		int row = 0; //줄 수
		
		//연산 처리(if ~ else문)
		if(customer % column == 0) {	//나누어 떨어지면
			row = customer / column;	//row = 몫
		}else {	//나머지
			row = customer / column + 1;	//row = 몫 + 1
		}		
		System.out.println(row + "줄이 필요합니다.");
		
		scan.close();
	}

}
