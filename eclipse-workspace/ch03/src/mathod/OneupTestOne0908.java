package mathod;

public class OneupTestOne0908 {
			
		// 1 증가하는 함수 정의
		// 지역
		public static int oneUp() {
			int x = 1; //지역 변수
			x ++;
			return x;
		}
		public static void main(String[] args) {
			System.out.println(oneUp());	//2
			System.out.println(oneUp());	//2
		}
	}//main