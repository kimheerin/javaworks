package polymorphism.fruit;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);				//입력할 거임
		
		System.out.println("1.포도 | 2.바나나 | 3.복숭아");
		System.out.print("선택 > ");
		//문자를 숫자형으로 변환
		int selectNo = Integer.parseInt(scanner.nextLine());	//숫자로 입력 가능하게
		
		//객체 생성 시, 다형성 이용
		Fruit fruit = null; 		//??
		if(selectNo == 1) {
			fruit = new Grape();
		}else if(selectNo == 2) {
			fruit = new Banana(); 
		}else if(selectNo == 3) {
			fruit = new Pitch();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		fruit.showFruitInfo();		//출력 
		
		
		
		
	scanner.close();
	}

}
