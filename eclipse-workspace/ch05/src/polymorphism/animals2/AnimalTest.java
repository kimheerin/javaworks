package polymorphism.animals2;

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

	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}

	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}

}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
	}
}

public class AnimalTest {

	public void moveAnimal(Animal animal) {
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();

		// Animal(부모)의 move 메서드
		// moveAnumal() 호출
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());

		System.out.println("▼▼▼▼ 원래 형으로 다운 캐스팅 ▼▼▼▼");
		//크기가 Animal 인스턴스를 저장할 배열을 생성
		Animal[] animals = new Animal[3];
		
		//자식 객체 생성
		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Eagle();
		
		for(int i=0; i<animals.length; i++) {	//배열을 순화하면서
			Animal animal = animals[i]; 		//0번 인덱스부터 객체 저장
			if(animal instanceof Human) {
				Human human = (Human)animal;	//human 타입 객체 형변환
				human.readBook();
			}else if(animal instanceof Tiger) {
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}else if(animal instanceof Eagle) {
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}	
		}
		
		
		
		
		/*Animal human = new Human();
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();

		// 강제 형변환 - instanceof 키워드 사용
		if (human instanceof Human) { 
			Human h = (Human) human; // 자식 타입 = (자식 타입)부모 타입
			h.readBook();
		}
		if (tiger instanceof Tiger) {
			Tiger t = (Tiger) tiger;
			t.hunting();
		}
		if (eagle instanceof Eagle) {
			Eagle e = (Eagle)eagle;
			e.flying();
		}*/
	}
}
