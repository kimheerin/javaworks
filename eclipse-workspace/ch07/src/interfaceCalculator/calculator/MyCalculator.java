package interfaceCalculator.calculator;

public class MyCalculator implements Calculator {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}
	@Override
	public int div(int num1, int num2) {
		//분모를 0으로 나눌 수 있음
		if(num2 != 0) {
			return num1 / num2;
		}else {
			return Calculator.ERROR;	//에러 처리를 함수로 함
		}
	}	
}
