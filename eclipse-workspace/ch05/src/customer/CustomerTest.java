package customer;

public class CustomerTest {

	public static void main(String[] args) {
			// 일반 고객 1명, VIP 고객 1명 객체 생성 | 매개변수가 없는
			Customer lee = new Customer();
			//입력
			lee.setCustomerId(1001);
			lee.setCustomerName("이효리");
			
			int price = 10000; //구매 가격
			lee.calcPrice(price);
			
			//출력
			System.out.println(lee.showCustomerInfo());
			
			System.out.println("=====================");
		
			VipCustomer ha = new VipCustomer();
			ha.setCustomerId(1002);
			ha.setCustomerName("하동훈");
			ha.setagId(777);

			System.out.println(ha.showCustomerInfo());
			

			
		
}

}
