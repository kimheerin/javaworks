package customer;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 부모형으로 객체 생성 - 자동 형변형
		// 매개변수가 있는 ... set,get ㄴㄴ
		Customers lee = new Customers(1001, "이효리");
		
		int price = 10000;
		lee.calcPrice(price);
		int cost = lee.calcPrice(price);
		
		System.out.println(lee.getCustomerName() + "가 지출한 비용 : " + cost + "원");
		System.out.println(lee.showCustomerInfo());
		
		
		System.out.println("================================");
		//부모형으로 객체 생성 - 자동 형변형
		Customers woo = new VipCustomers(1010, "우원재", 888);
		
		price = 20000;
		cost = woo.calcPrice(price);
		
		System.out.println(woo.getCustomerName() + "가 지출한 비용 : " + cost + "원");
		System.out.println(woo.showCustomerInfo());

	}

}
