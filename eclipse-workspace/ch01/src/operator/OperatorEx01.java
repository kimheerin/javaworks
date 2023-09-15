package operator;

public class OperatorEx01 {

	public static void main(String[] args) {
		// 산술 연산자(상수)
		System.out.println(4 + 8); //12
		System.out.println(4 - 8); //3
		System.out.println(4 * 8); //28
		System.out.println(4 / 8); //11
		System.out.println(4 /(double)8); //8.5, 형변환(type conversion)
		
		// 산술 연산자(변수)
		int a = 4;
		int b = 8;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		

	}

}
