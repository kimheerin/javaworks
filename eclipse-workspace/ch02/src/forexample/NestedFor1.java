package forexample;

public class NestedFor1 {

	public static void main(String[] args) {
		// 중접 for문
		
		
		// 5행 5열에 '*' 출력
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
			System.out.print('*');
		}
			System.out.println();
		}
		System.out.println();
		
			
		//직각삼각형 '*' (1,2,3,4,5)
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print('*');
		}
		System.out.println();
		}
		
		
		//직각삼각형 '*' (5,4,3,2,1)
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=6-i; j++) {
			System.out.print('*');
		}
		System.out.println();
		}
		

		
		
		
		
		
	}

}
