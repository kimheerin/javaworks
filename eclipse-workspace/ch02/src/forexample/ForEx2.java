package forexample;

public class ForEx2 {

	public static void main(String[] args) {
		// 1부터 10까지 더하기
		// 변수 - i, total
		
		int i = 0;
		int total = 0;
		
		for(i = 1; i <= 10; i++) {
			total += i;
			System.out.println("i= " +  i + ", total= " + total);
		}
			System.out.println("\n합계 " + total);

	}

}
