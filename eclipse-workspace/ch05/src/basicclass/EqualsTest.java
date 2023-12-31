package basicclass;

public class EqualsTest {

	public static void main(String[] args) {
		String name1 = new String("김희린");
		String name2 = new String("김희린");
		
		//인스턴스의 메모리 주소 비교
		
		//System.out.println(name1);						 	//문자열로 재정의되어 있어 주소가 출력되지 않음
		//System.out.println(System.identityHashCode(name1));	//identiyHashCode 사용
		//System.out.println(System.identityHashCode(name2));	//identiyHashCode 사용
		
		System.out.println(name1 == name2);  					//주소 비교 - false
		System.out.println(name1.equals(name2));  				//문자 비교 - true | .equals() 사용
		
		System.out.println("============================");
		
		Book book1 = new Book(100, "개미");
		Book book2 = new Book(100, "개미");
		
		System.out.println(book1 == book2); 					//주소 비교 - false
		System.out.println(book1.equals(book2)); 				//문자 비교 - false .. true 나오기 위해서는 재정의 필요
	
		//book 인스턴스 물리적 주소
		System.out.println(System.identityHashCode(book1));
		System.out.println(System.identityHashCode(book2));
		
		//논리적 주소 일치 시킴 - HashCode() : object 클래스가 제공
	
	}

}
