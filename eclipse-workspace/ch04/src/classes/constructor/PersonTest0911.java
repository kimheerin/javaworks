package classes.constructor;

public class PersonTest0911 {

	public static void main(String[] args) {
		// Person 객체 생성과 사용
		Person p1 = new Person();							//1.기본 생성자
		p1.height = 165.3f;		//float니까 뒤에 f 붙이기
		p1.weight = 51.2f;		//			"	
		p1.showPersonInfo();
		
		System.out.println("\n=================================");
		
		Person p2 = new Person("홍길동");						//2.매개변수가 있는 생성자
		p2.height = 183.2f;
		p2.weight = 76.7f;
		p2.showPersonInfo();
		
		System.out.println("\n==========="
				+ ""
				+ "=====================");
		
		Person p3 = new Person("김길동", 180.3f, 90.1f);		//3.매개변수가 있는 생성자(모든 필드)
		p3.showPersonInfo();
		
		
		
		
	}

}
