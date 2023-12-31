package wrapper;

public class IntegerTest {

	public static void main(String[] args) {
		//int num1 = 100;
		Integer num1 = 100;
		int num2 = 200;
		//num1이 객체이므로 메서드 접근 가능
		int sum = num1.intValue() + num2;	// Integer 입력 -> 변수명.intValue 출력
		
		System.out.println(num1);
		System.out.println(sum);
		
		//valueOf() : 정수 또는 문자열 - > 숫자 변환
		Integer num3 = Integer.valueOf("123");
		System.out.println(num3);
		
		//parseInt() : 문자열 -> 숫자 변환
		int num4 = Integer.parseInt("456");
		System.out.println(num4);
	}

}

