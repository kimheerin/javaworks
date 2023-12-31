package arrays;

public class ArrayTest1 {

	public static void main(String[] args) {
		// 변수
		String car1 = "Sonata";
		String car2 = "Morning";
		String car3 = "K8";
		String car4 = "K7";
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
		System.out.println("======================");
		
		
		//배열
		//직접 저장 - 중괄호{} 사용
		String[] cars = {"Sonata", "Moring", "K8", "K7"};
		System.out.println(cars[0]);
		System.out.println(cars[1]);
		System.out.println(cars[2]);
		System.out.println(cars[3]);
		
		
		//배열의 크기(개수) - 배열 이름.length
		System.out.println("배열의 크기 : " + cars.length);
		
		
		//for문 - 전체 조회
		for(int i=0; i < cars.length; i++) {
			System.out.println(cars[1]);	//0, 1, 2, 3
		}
		
		
		
		

	}//class

}//main
