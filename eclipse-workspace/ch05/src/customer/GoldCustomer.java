package customer;

public class GoldCustomer extends Customer {
	double saleRatio; //구매 할인율
	
	public GoldCustomer() {
		customerGrade = "GOLD";
		saleRatio = 0.01;
		bonusRatio = 0.02;
	}

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "GOLD";
		saleRatio = 0.01;
		bonusRatio = 0.02;
	}
	
	@Override
	public int calcPrice(int price) {
		price -= (int)(price*saleRatio);
		bonusPoint += (int)(price*bonusRatio);
		return super.calcPrice(price);
	}

	public String showCustomerInfo() {
		return customerName + "의 등급 " + customerGrade + " | " +
				"보너스 포인트 : " + bonusPoint;
	}
}
