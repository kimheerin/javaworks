package funcinterface.object;

public class LamdaFersonTest {

	public static void main(String[] args) {
		//펄슨 객체 생성
		Person person = new Person();
		
		//추상 메서드 구현 | 람다식 ()->
		person.action(() -> {
			System.out.println("출근 中");
			System.out.println("프로그래밍 中");
		});
		person.action(() -> System.out.println("퇴근 中"));
	}

}
