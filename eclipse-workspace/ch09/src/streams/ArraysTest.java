package streams;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
	//메인 안 만들었을 경우 : main > 컨+스페이스바
	public static void main(String[] args) {
		Integer[] num1 = {3, 1, 2, 4, 5,};
		
		//오름차순 정렬 - Arrays.sort()
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		//오름차순으로 정렬된 배열을 거꾸로(내림차순)
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
		
		//num1에서 3개만 복사 - Arrays.copyOf()
		Integer[] num2 = Arrays.copyOf(num1, 3);
		System.out.println(Arrays.toString(num2));
		
		//Arrays.toString : 객체 그대로 출력
		System.out.println(Arrays.toString(num1)); 	//num1.toString 해도 코드가 나온다... 재정의가 되어 있지 않은 것
	}

}
