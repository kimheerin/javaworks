package ifexample;

import java.util.Scanner;

public class ScorePointTest {

	public static void main(String[] args) {
		// 점수에 따른 학점 계산 프로그램
		// 변수 = score(정수형), grade(문자형)
		// A학점 - 90 ~ 100점
		// B학점 - 80 ~ 90점
		// C학점 - 70 ~ 80점
		// D학점 - 60 ~ 70점
		// F학점 - 60점 이하
		
		// 객체(변수) scan 생성
		Scanner scan = new Scanner(System.in);
		
		//입력
		System.out.print("점수를 입력하세요. : ");
		int score = scan.nextInt();	//사용자 입력
		char grade = 'A';	//char - 한 문자(홑따옴표)
		
		//연산
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score > 80 && score < 90) {
			grade = 'B';
		}else if(score > 70 && score < 80) {
			grade = 'C';
		}else if(score > 60 && score < 70) {
			grade = 'D';
		}else {
			grade = 'F';
		}	
					
		//출력
		System.out.println("\n" + grade + "학점입니다.");
		scan.close();
		
	}

}
