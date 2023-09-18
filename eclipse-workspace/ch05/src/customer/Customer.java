package customer;

public class Customer {
	protected int customerId; 		//고객 ID
	protected String customerName;	//고객명
	protected String customerGrade;	//고객 등급
	int bonusPoint;					//보너스 포인트
	double bonusRatio;				//보너스 적립율
	
	public Customer() {
		customerGrade= "SILVER";	//기본등급
		bonusRatio= 0.01;			//1%
	}
	public Customer(int customerId, String customerName) {
		this.customerId = customerId;
		this.customerName = customerName;
		customerGrade= "SILVER";	//기본등급
		bonusRatio= 0.01;			//1%
	}	
	public void setCustomerId(int customerId) {	//ID 입력
		this.customerId = customerId;			
	}
	public int getCustomerId() {				//ID 출력
		return customerId;
	}
	public void setCustomerName(String customerName) { //이름 입력
		this.customerName = customerName;
	}
	public String getCustomerName() {					//이름 출력
		return customerName;
	}
	//보너스 포인트 계산
	public int calcPrice(int price) {
		bonusPoint +=(int)(price * bonusRatio);
		return price;	
	}
	//정보 출력
	public String showCustomerInfo() {
		return customerName + "의 등급 " + customerGrade + " | " +
							"보너스 포인트 : " + bonusPoint;
	}

	
}