package customer;

public class VipCustomers extends Customers {
	private int agId;		//전문 상담원
	double saleRatio; 		//구매 할인율
	
	public VipCustomers() {
		customerGrade = "VIP";
		saleRatio = 0.1;	//구매 할인율 10%
		bonusRatio = 0.05;	//보너스 적립 5%
	}
	
	public VipCustomers(int customerId, String customerName, int agId) {
		super(customerId, customerName);
		this.agId = agId;
		customerGrade = "VIP";
		saleRatio = 0.1;	//구매 할인율 10%
		bonusRatio = 0.05;	//보너스 적립 5%
	}
	public void setagId(int agId) {
		this.agId = agId;
	}
	//구매 가격 = 가격 - (가격 * 구매할인율)
	@Override
	public int calcPrice(int price) {
		price -= (int)(price*saleRatio);
		bonusPoint += (int)(price*bonusRatio);
		return super.calcPrice(price);
	}
	@Override
	public String showCustomerInfo() {
		return customerName + "의 등급 " + customerGrade + " | " +
				"보너스 포인트 : " + bonusPoint+ "\n전문 상담원 계정 : " + agId;
	}
}
	

