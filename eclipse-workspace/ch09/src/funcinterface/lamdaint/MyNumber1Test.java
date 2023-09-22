package funcinterface.lamdaint;

public class MyNumber1Test {

	public static void main(String[] args) {
		//인터페이스형 변수 선언
		MyNumber1 number;
		
		//변수에 람다식 저장
		//calculator()를 구현함
		//매개변수가 1개인 경우 소괄호 생략 가능
		/*number = (x) -> {	//더하기 연산
			x = x + 10;
			System.out.println(x);
		};*/
		//어떤 수에 10을 더하는 함수
		number = x -> System.out.println(x + 10);
		
		//Calculator() 호출
		number.calculator(1);
		
		//어떤 수를 제곱하는 함수 구현
		number = n -> System.err.println(n * n);
		number.calculator(2);
	}

}
