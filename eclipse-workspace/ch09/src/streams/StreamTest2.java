package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		//문자형 배열
		String[] 과일 = {"사과", "배", "아보카도", "무화과"};
		
		//for문 X forEach 사용 -> stream 객체를 얻어옴
		/*Stream<String> strStream = Arrays.stream(과일);
		strStream.forEach(str -> System.out.println(str));*/
		Arrays.stream(과일).forEach(str -> System.out.println(str));
		
		//정수형 배열
		int[] number = {1, 2, 3, 4};
		/*Stream<Integer> numStream = Arrays.stream(number);
		numStream.forEach(n -> System.err.println(n));*/
		Arrays.stream(number).forEach(n -> System.err.println(n)); //위의 간단 ver.
		
		//합계
		int sumVal = Arrays.stream(number).sum();	//sum 쓰려면 int로
		
		//count()의 함수형의 long이므로 int로 다운캐스팅
		//개수
		int count = (int) Arrays.stream(number).count();
		
		//평균
		double avg = (double) sumVal / count;
		
		System.out.println("합계 : " + sumVal);
		System.out.println("개수 : " + count);
		System.out.println("평균 : " + avg);

	}

}
