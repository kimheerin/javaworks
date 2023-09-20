package template;

public class CarTest {

	public static void main(String[] args) {
		//추상 클래스는 객체 생성 안 됨
		//Car car = new Car();
		//추상 클래스 타입으로 객체 생성
		Car Manual = new ManualCar(); //부모형 출력 | 부모형, 자식형으로 해도 부모형 함수가 출력됨 (자식이 상속받아서)
		Manual.run();
		
		System.out.println("--------------------------------------------------");
		
		Car myCar = new AICar();
		myCar.run();
		
		/*final 클래스 테스트
		String msg = "좋은 하루 보내세요.";
		System.out.println(msg);
		
		Integer num = 100;
		System.out.println(num);*/
		
		

	}
}
