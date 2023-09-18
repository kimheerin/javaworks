package abstracts.animal;

public class AnimalTest {

	public static void main(String[] args) {
		
		//방법1 cat 클래스 인스턴스
		/*Cat cat = new Cat();
		cat.breathe();
		cat.sound();*/
		
		//방법2 다형성으로 객체 생성
		Animal cat = new Cat();
		cat.breathe();
		cat.sound();
		
		Animal dog = new Dog();
		dog.breathe();
		dog.sound();
		
		System.out.println("=================================");
		
		//방법3 메서드의 매개변수의 다형성
		animalSound(new Dog());
		animalSound(new Cat());	
	}
	public static void animalSound(Animal animal) { //메서드의 매개변수의 다형성
		animal.breathe();
		animal.sound();
	}
}
