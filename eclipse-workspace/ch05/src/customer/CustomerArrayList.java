package customer;

import java.util.ArrayList;

public class CustomerArrayList {

	public static void main(String[] args) {
		//일반 고객 2명, 골드 2명, vip 1명
		
		//Customers[] customer = new Customers[5]
		//주머니 생성
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//리스트 add에 직접 객체 생성 후 저장(생성과 저장을 한 번에!)
		
		
		//고객 객체(값) 생성 - 부모 타입으로 생성(다향성)
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer youl = new GoldCustomer(10040, "이율곡");
		Customer king = new VipCustomer(10050, "세종대왕", 1004);
		
		//고객 객체 저장(주머니에 값 담자)
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(youl);
		customerList.add(king);
	
		//상품 구매
		int price = 10000;
		
		//고객 정보 출력
		for(int i=0; i<customerList.size(); i++) {
			Customer customer = customerList.get(i);
			//보너스 적립금 계산
			int cost = customer.calcPrice(5000);
			System.out.printf("%s님이 지불할 비용 : %d원 | ", customer.getCustomerName(), cost);
			System.out.println(customer.showCustomerInfo());
			
			
		}
		
	}

}
