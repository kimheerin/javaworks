package inheritance.transport;

public class Vehicle {
	String vehicleName;	//차량 이름
	int money;			//수입
	int passengerCount;	//승객 수
	
	//생성자
	public Vehicle(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	//요금 | 메서드(함수)
	public void carry(int fare) {
		this.money += fare;
		passengerCount++;
	}
	//차량 정보
	public void showInfo() {
		System.out.printf("%s 수입은 %,d원이고, 승객수는 %d명입니다.\n",
							vehicleName, money, passengerCount);
	}
}
