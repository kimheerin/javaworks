package streams.coustomer;

public class Customer {
	//필드
	private String name;	//이름
	private int age;		//나이
	private int price;		//경비
	
	//생성자
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getPrice() {
		return price;
	}

}
