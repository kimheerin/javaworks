package operator;

public class OperatorEx02 {

	public static void main(String[] args) {
		// 비교 연산자
		// 결과는 boolean 자료 - true/false
		System.out.println(4 < 5); //true
		System.out.println(4 > 5); //false
		System.out.println(4 == 5); //false, 같다
		System.out.println(4 != 5); //false, 같지 않다

		//변수를 사용하여 비교 연산하기
		int n1 = 4, n2 = 5; //변수 2개를 연속하여 선언
		System.out.println(n1 > n2); //false
		System.out.println(n1 < n2); //ture
		System.out.println(n1 == n2); //ture
		System.out.println(n1 != n2); //false
		
		System.out.println("================================");
		
		//손흥민 선수가 미혼
		//결과가 "미혼입니다."
		boolean isMarried = false;
		System.out.println(isMarried);
		
		//조건 연산자 : (비교값) ? 참인값 : 거짓인값
		String result = (isMarried == true) ? "기혼입니다." : "미혼입니다.";
		System.out.println("손흥민 선수는 " + result);
		
		
		//정수의 합계, 평균
		int korScore = 98; //국어점수가 98점('='은 대입연산자)
		int mathScore = 88;
		int sumScore; //합계 변수 선언
		int avgScore; //평균 = 총점 / 과목수
		
		sumScore = korScore + mathScore; //합계 계산
		avgScore = sumScore / 2;
		
		System.out.println("총점 : " + sumScore);
		System.out.println("평균 : " + avgScore);
		
		
		
		
		
		
	}
	

}

