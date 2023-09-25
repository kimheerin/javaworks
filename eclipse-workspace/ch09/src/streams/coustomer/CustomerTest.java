package streams.coustomer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest {

	public static void main(String[] args) {
		//고객을 저장할 자료 구조 - ArrayList
		List<Customer> customerList = new ArrayList<>();
		
		//고객 객체 생성
		Customer lee = new Customer("이효리", 40, 100);
		Customer park = new Customer("박수박", 30, 100);
		Customer seo = new Customer("서지원", 15, 50);
		
		//자료 저장(추가)
		customerList.add(lee);
		customerList.add(park);
		customerList.add(seo);
		
		System.out.println("==== 고객 명단 출력 ====");
		
		/*
		 for(Customer cust : customerList)
		 	Systeom.out.prinln(customer.getName());
		 */
		
		//Stream의 람다식을 사용
		Stream<Customer> stream = customerList.stream();
		stream.map(c -> c.getName())
						.forEach(s -> System.out.println(s));
		
		//여행 비용
		int total = customerList.stream().
					mapToInt(c -> c.getPrice())
					.sum();
		System.out.println("총 경비는 " + total + "만 원입니다.");
		
		//조건.. 남바원
		System.out.println("==== 20세 이상인 고객 명단 ====");
		//중간 연산 - filter(), map()
		//최종 연산 - forEach()
		customerList.stream()
					.filter(c -> c.getAge()  >= 20)
					.map( c-> c.getName())
					.sorted()
					.forEach(s -> System.out.println(s));
	}
}
