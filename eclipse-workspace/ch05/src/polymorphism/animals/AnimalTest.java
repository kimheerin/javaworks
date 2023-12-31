package polymorphism.animals;
//다형성
class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}
class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	/*public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}*/
}
class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 날고 있습니다.");
	}
	/*public void move() {
		System.out.println("독수리가 날고 있습니다.");
	}*/
}
class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	/*public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}*/
}
public class AnimalTest {	//public 있어야 파일 이름임
	//moveAnimal() 정의
	public void moveAnimal(Animal animal) {	//부모 타입
		animal.move();
		
	}

	public static void main(String[] args) {
		//AnimalTest 타입으로 객체 생성
		AnimalTest aTest = new AnimalTest();	//파일 이름 자체를 객체로 만듦
		
		//Animal 타입으로 객체 생성
		Animal human = new Human();
		Animal eagle = new Eagle();
		Animal tiger = new Tiger();
		
		//moveAnimal() 호출
		aTest.moveAnimal(human);	// == (Animal animal = new Human)
		aTest.moveAnimal(eagle);	
		aTest.moveAnimal(tiger);	

	}

}
