package classes.methods;

public class Hello {
	//기본 생성자
	//public Hello() {}
	
	//sayHello() 메소드 정의
	//메소드 오버로딩(함수 이름은 같고 매개변수가 다름)
	public void sayHello() {
		System.out.println("Hi");
	}

	public void sayHello(String name) {
		System.out.println("Hi " + name);
	}
}
