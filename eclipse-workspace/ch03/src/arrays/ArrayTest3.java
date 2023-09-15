package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 크기가 4인 정수형 배열 선언
		
		int[] number = new int[4];
		int total = 0;		
		double avg;						//평균 = 합계 / 개수
		
		//입력
		number[0] = 10;
		number[1] = 20;
		number[3] = 30;
		
		//직접 초기화
		//int[] number = (10, 20, 30, 0);
		
		//2번 인덱스 값 출력
		System.out.println(number[2]);
		
		//전체 조회(출력)
		//합계와 평균
		for(int i =0; i < number.length; i++) {
			total += number[1];			//누적 합계
			System.out.println(number[i]);			
		}
		avg = total / number.length;	//평균 = 합계 / 개수
	
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
		
		
		
		
		
	}//main
}//class
