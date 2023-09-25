package streams.booktest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
}

public class LibrayTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();

		bookList.add(new Book("가가가", 10000));
		bookList.add(new Book("나나나", 20000));
		bookList.add(new Book("다다다", 30000));
		
		//Stream | 가격 합
		Stream<Book> stream = bookList.stream();
		int total = bookList.stream()
							.mapToInt(h -> h.getPrice())
							.sum();
		System.out.println("총 가격 : " + total + "원");
		
		//Stream | 2만 원 이상인 책 이름 오름차순 정렬
		System.out.println("==== 2만원 이상(오름차순) ====");
		bookList.stream()
				.filter(h -> h.getPrice() >= 20000)
				.map(h -> h.getName())
				.sorted()
				.forEach(r -> System.out.println(r));
	}
}
