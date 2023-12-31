package objectarray.dogs;

public class DogArray {

	public static void main(String[] args) {
		// Dog 인스탠스 4개를 생성해서 배열에 저장하고
		// 정보를 출력하세요(get()함수 사용
		
		Dog[] dogs = new Dog[4];

		dogs[0] = new Dog("heart", "진돗개");
		dogs[1] = new Dog("star", "말티즈");
		dogs[2] = new Dog("moon", "웰시코기");
		dogs[3] = new Dog("love", "닥스훈트");
		
		//전체 출력
		for(int i=0; i<dogs.length; i++) {
			System.out.print(dogs[i].getName() + " | ");
			System.out.println(dogs[i].getType());
		}
		System.out.println("================================");
		
		//향상된 for문
		for(Dog dog : dogs) {
			System.out.println(dog.getName() + " | " + dog.getType());
		}
		
	}

}
