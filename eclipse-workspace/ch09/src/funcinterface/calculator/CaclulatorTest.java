package funcinterface.calculator;

public class CaclulatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언 - add
		Calculator add;
		int num1 = 19, num2 = 5;
		
		//calculate()를 구현 - 람다식
		//덧셈 구현
		add = (x, y) -> (x + y);
		
		//호출
		System.out.println("덧셈 : " + add.Calculate(num1, num2));
		
		//뺄셈 구현
		add = (x, y) -> (x - y);
		
		//호출
		System.out.println("뺄셈 : " + add.Calculate(num1, num2));
		
		//곱셈 구현
		add = (x, y) -> (x * y);
		
		//호출
		System.out.println("곱셈 : " + add.Calculate(num1, num2));
		
		//나눗셈 구현
		add = (x, y) -> (x / y);
		
		//호출
		System.out.println("나눗셈 : " + add.Calculate(num1, num2));

	}

}
