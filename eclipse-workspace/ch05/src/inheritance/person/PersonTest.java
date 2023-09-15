package inheritance.person;

public class PersonTest {

	public static void main(String[] args) {
		//Engineer에서 상속했으므로, Person에 필드를 사용할 수 있음
		Engineer lee = new Engineer("효리", 10, 111);
		
		System.out.println("이름 : " + lee.getName());
		System.out.println("나이 : " + lee.getAge());
		System.out.println("사번 : " + lee.getComId());

	}

}
