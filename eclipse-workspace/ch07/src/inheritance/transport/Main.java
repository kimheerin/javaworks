package inheritance.transport;

public class Main {

	public static void main(String[] args) {
		//Person 객체 생성
		Person sohee = new Person("박소희", 10000);
		Person hyolee = new Person("이효리", 20000);
		
		//Bus 객체 생성
		Bus bus100 = new Bus("100번 버스");
		
		//kakaotaxi 객체 생성
		KakaoTaxi katax = new KakaoTaxi("카택");
		
		//버스 타기
		sohee.take(bus100, 1500);
		hyolee.take(bus100, 1500);
		
		//택시 타기
		hyolee.take(katax, 5500);
		sohee.take(katax, 6000);
		
		//정보 출력
		sohee.showPersonInfo();
		hyolee.showPersonInfo();
		
		bus100.showInfo();
		katax.showInfo();
	}

}
