package inheritance.transport;

//사람 클래스(자료형)
public class Person {

	//필드
	String name;	//사람
	int money;		//보유 금액
	
	//생성자
	public Person(String name, int money) {
		this.name= name;
		this.money = money;
	}
	public void take(Vehicle vehicle, int fare) {
		vehicle.carry(fare);
		this.money -= fare;
	}
	//사람 정보 출력
	public void showPersonInfo() {
		System.out.println(name + " 잔여 금액 : " + money);
	}
}
