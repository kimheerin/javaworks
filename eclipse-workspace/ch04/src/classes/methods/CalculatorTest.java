package classes.methods;

//다른 패키지에 있을 시, import 필요

public class CalculatorTest {

	public static void main(String[] args) {
		// 정수형 Calculator 객체 생성
		Calculator calc = new Calculator();
		int num1 = 10, num2 = 2;
		
		//int add = calc.add(10, 11);	//변수 사용
		int addVal = calc.add(num1, num2);	//출력을 위해 변수 생성
		int subVal = calc.sub(num1, num2);	
		int mulVal = calc.mul(num1, num2);	
		int divVal = calc.div(num1, num2);	
		
		System.out.println("total(+) : " + addVal);
		System.out.println("total(-) : " + subVal);
		System.out.println("total(x) : " + mulVal);
		System.out.println("total(/) : " + divVal);
		

	}

}
