package arraytest;

//함수를 만들어서 함수로 호출하기
public class ArrayTest {
	
	public static int add(int[] arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			System.out.println(arr[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4};
		//add() 호출할 때, 매개변수로 배열을 전달함
		int result = add(numbers);
		
		System.out.println(result);
	}
}
