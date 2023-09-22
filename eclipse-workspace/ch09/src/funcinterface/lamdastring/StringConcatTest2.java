package funcinterface.lamdastring;

public class StringConcatTest2 {

	public static void main(String[] args) {
		//인터페이스형 변수 선언
		StringConcat concat;
		String str1 = "배고";
		String str2 = "프쇼";
		
		//makeString() 람다식 구현
		concat = (m, n) -> System.out.println(m + " " + n); 
		
		//makeString() 호출
		concat.makeString(str1, str2);
	}

}
