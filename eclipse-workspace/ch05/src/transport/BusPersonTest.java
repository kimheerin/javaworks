package transport;

public class BusPersonTest {

	public static void main(String[] args) {
		//사람 객체 생성
		Person p1 = new Person("홍길동", 10000);
		Person p2 = new Person("김길동", 20000);
		Person p3 = new Person("김희린", 50000);
		//버스 객체 생성
		Bus bus100 = new Bus(100);
		Bus bus777 = new Bus(777);
		//지하철 객체 생성
		Subway green = new Subway("2호선");
		//동작
		p1.takeBus(bus100);
		p2.takeBus(bus100);
		p3.takeBus(bus777);
		p1.takeSubway(green);
		//사람 및 교통수단 결과값 출력
		p1.showPersonInfo();
		p2.showPersonInfo();
		p3.showPersonInfo();
		System.out.println("==============================");
		bus100.showBusInfo();
		bus777.showBusInfo();
		green.showsubwayInfo();
	}

}
