package calctime;

public class SystemTime {

	public static void main(String[] args) {
		//성능 테스트 소요 시간
		
		//long start = System.currentTimeMillis(); 	//현재까지의 시간(밀리초)
		long start = System.nanoTime();
		
		int sum = 0;
		for(int i=1; i<10000; i++) {
			sum += i;
		}
		
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		
		System.out.println(sum);
		//System.out.println((end-start) + "ms");
		System.out.println((end-start/10000) + "ns");

		
		
		
		
		
		
		
	}//main

}
