package arrays;

public class ArrayGugudan {

	public static void main(String[] args) {
		//구구단 3단 출력
		//a. 기본
		int dan = 3;
		System.out.println("3단 시작");
		for(int i=1; i<10; i++) {
			System.out.println(dan + "x" + i + "=" + dan * i);
		}
		System.out.println("==================================");
		
		//b. 배열 |주머니 생성
		int[] gugudan = new int[9];

		//주머니에 저장(int dan = 3;)
		for(int i=0; i <gugudan.length; i++) {
			gugudan[i] = dan * (i+1);         //3=3x1 6=3x2 9=3x3... 
		}
		
		//주머니 출력
		for(int i=0; i <gugudan.length; i++) {
			System.out.println(dan + " x " + (i+1) + " = " + gugudan[i]) ;			
		}
		System.out.println("==================================");
		//배열 복사
		int[] gugudan2 = new int[9];
		
		//a.일반 복사
		for(int i=0; i<gugudan.length; i++) {
			gugudan2[i] = gugudan[i]; 		//구구단 i를 구구단2 i로 복사
		}
		for(int i=0; i<gugudan2.length; i++) {
			System.out.println(dan + " x " + (i+1) + " = " + gugudan2[i]);
		}
		System.out.println("==================================");
		//b.-Object 클래스의 clone()
		int[] gugudan3 = gugudan.clone(); 
			for(int i=0; i<gugudan2.length; i++) {
				System.out.println(dan + " x " + (i+1) + " = " + gugudan2[i]);
			}
	}//main	
}//class