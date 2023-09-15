package whileexample;

public class whileEx2 {

	public static void main(String[] args) {
		// 1부터 10까지의 합계
		// 변수 - n, sum
		
		
		int n = 0;
	
		/*n += 1; // n = n + 1 = 1
		n += 2; // n = n + 2 = 3
		n += 3; // n = n + 2 = 6
		*/
		
		int sum = 0;
		
		while(n <= 10) {
			n++;
			sum += n;
		}
		System.out.println("합계: " + sum);
		
		
		
		
		
	}
		

	}


