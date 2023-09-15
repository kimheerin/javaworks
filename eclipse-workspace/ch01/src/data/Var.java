package data;

public class Var {

	public static void main(String[] args) {
		// 변수를 사용
		// 변수 선언 방법 - 자료형 변수 이름
		int year; // 정수 자료형 변수 year 선언
		year= 2023; // 변수 year에 2023 대입
		System.out.println(year+"년");
		
		int month = 9; // 변수의 초기화(선언과 동시에 값을 대입)
		System.out.println(month + "월");
		
		//5일 출력(변수이름-day)
		int day = 5;
		System.out.println(day + "일");
		
		// 손흥민은 3학년 2반입니다.
		// 변수 : 이름(name), 학년(grade), 반(schoolClass)
		// 문자열 자료형 - String, 한 문자 자료형 - char
		/*변수 이름 명명시 문법 오류
		  1. 예약어(이미 정해진 명령어)는 사용 불가
		  2. 변수명에 공백 불가
		  3. 숫자로 시작 불가
		 */

		String name = "손흥민";
		int grade = 3;
		int schoolClass = 2;
		System.out.println(name + "은 " + grade + "학년 "
						+ schoolClass + "반입니다.");
	
	
		
		
	}

}
