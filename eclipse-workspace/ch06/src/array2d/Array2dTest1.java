package array2d;

public class Array2dTest1 {

	public static void main(String[] args) {
		//정수형 2차원 배열
		int[][] arr = new int[2][3];		//[열 크기값][행 크기값]
		
		System.out.print(arr.length);		//행의 크기(가로)
		System.out.println(arr[0].length); 	//1행 1열의 크기(세로)
		System.out.println(arr[1].length); 	//1행 2열의 크기
		
		//전체 출력 | arr1
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println(); //줄바꿈
		}
		//배열에 값을 저장
		arr[0][0] = 1;
		arr[0][1] = 2; 
		arr[0][2] = 3;
		arr[1][0] = 4; 
		arr[1][1] = 5; 
		arr[1][2] = 6; 
		
		//특정한 요소를 출력
		System.out.println(arr[1][1]);
		
		//선언과 함께 초기화		
		int[][] arr2 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		//전체 출력| arr2
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.println(arr2[i][j] + " ");
			}
			System.out.println(); //줄바꿈
		}
		
	}//main

}
