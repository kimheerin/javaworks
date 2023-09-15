package transport;

public class Bus {

	//1.필드
	int busNum;		//버스 번호
	int pass;		//승객
	int money;		//수입
	//2.생성자(매개변수가 있는) | 생성자 or set,get
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	//버스가 승객 태움
	public void take(int fee) {	//요금 받음
		this.money += fee;		//보유 금액 = 보유 금액 + 받은 금액
		pass++;					//한 명씩 탈 때
	}
	//버스 정보 출력
	public void showBusInfo() {
		System.out.println(busNum + "번 버스 수입 : " + money
								+", 승객 수 : " + pass);
	}
}


