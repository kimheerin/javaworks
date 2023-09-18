package abstracts.animal;

public class Cat extends Animal{
	
	//부모 클래스의 추상 메서드를 자식 클래스에서 반드시 구현
	public Cat() {
		this.kind = "고양이";
		System.out.println(kind);
	}
	@Override
	public void sound() {
		System.out.println("야옹~");
	}
}
