package arraylist;

import java.util.ArrayList;

public class DogArrayList {

	public static void main(String[] args) {
		
		//Dog 인스턴스를 저장할 리스트(주머니) 생성
		ArrayList<Dog> dogList = new ArrayList<>();
		
		//객체(값) 생성
		Dog dog1 = new Dog("백구1", "진돗개");
		Dog dog2 = new Dog("백구2", "치와와");
		Dog dog3 = new Dog("백구3", "불독");
		
		//인스턴스 저장(주머니에 값 담아)
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
	
		//2번 출력
		System.out.println(dogList.get(2));
		
		System.out.println("================================================");
		
		//전체 출력
		for(int i=0; i<dogList.size(); i++) {
			Dog dog = dogList.get(i);
			System.out.println(dog);
		}
	}

}
