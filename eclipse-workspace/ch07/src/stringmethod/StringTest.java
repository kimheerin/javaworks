package stringmethod;

public class StringTest {

	public static void main(String[] args) {
		//String 클래스를 사용하여 문자 연결 시, 내부의 문자열이 변경되지 않음
		String javaStr = new String("java");
		String iosStr = new String("ios");
		
		System.out.println(javaStr + "\n" + iosStr);
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(javaStr));	//ident... 십진수 코드
		System.out.println("처음 문자열 주소값 : " + System.identityHashCode(iosStr));	//ident... 십진수 코드
		
		//문자를 연결하는 메서드 - concat()
		javaStr = javaStr.concat(iosStr);	//둘을 더한 것
		
		System.out.println(javaStr);
		System.out.println("문자열 연결 후 주소값 : " + System.identityHashCode(javaStr));	//ident... 십진수 코드
	}

}
