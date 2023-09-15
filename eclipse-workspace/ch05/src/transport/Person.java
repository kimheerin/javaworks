package transport;
//사람 클래스(자료형)
public class Person {

	//1.필드
	String name;	//사람
	int money;		//보유 금액
	//2. 생성자
	public Person(String name, int money) {
		this.name= name;
		this.money = money;
	}
	//사람이 버스 탈 때
	public void takeBus(Bus bus) {
		bus.take(1500);			//버스 요금
		this.money -= 1500;		//보유 금액 - 버스 요금
	}
	//사람이 지하철 탈 때
	public void takeSubway(Subway subway) {
		subway.take(1350);			//지하철 요금
		this.money -= 1350;			//보유 금액 - 지하철 요금
	}
	//사람 정보 출력
	public void showPersonInfo() {
		System.out.println(name + " 잔여 금액 : " + money);
	}
}