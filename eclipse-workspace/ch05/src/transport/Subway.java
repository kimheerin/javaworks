package transport;

public class Subway {
	
	//1.필드
	String lineNum;		//지하철 호선	
	int pass;			//승객
	int money; 			//요금
	//2.생성자(매개변수가 있는) | 생성자 or set,get
	public Subway(String lineNum) {
		this.lineNum = lineNum;
	}
	//지하철이 승객 태움
	public void take(int fee) {	//요금 받음
		this.money += fee;		//보유 금액 = 보유 금액 + 받은 금액
		pass++;					//한 명씩 탈 때		
	}	
	//지하철 정보 출력
	public void showsubwayInfo() {
		System.out.printf("%s 지하철 수입 : %d원, 승객 수 : %d명", lineNum,
							money, pass);
								
	}
	
}
