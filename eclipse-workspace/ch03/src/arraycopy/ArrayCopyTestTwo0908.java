package arraycopy;

public class ArrayCopyTestTwo0908 {

	public static void main(String[] args) {
		// 배열 복사하기 - 문자형 복사
		char[] arr1 = {'N', 'E', 'T'};
		//크기가 3인 arr2인 배열 선언
		char[] arr2 = new char[3];

		
		//복사 - 저장
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
			
		
		//arr2 출력
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		
		}
		System.out.println();
		
		
		//역순 복사 - {'T', 'E', 'N')
		char[] arr3 = new char[3];
		for(int i = 0; i < arr2.length; i++){
			arr3[2-i] = arr2[i];
		}	
			
		//arr3 역순 출력
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]+ " ");
		}	
		
		
		
		
		
		
	}

}
