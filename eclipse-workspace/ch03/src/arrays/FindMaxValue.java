package arrays;

public class FindMaxValue {

	public static void main(String[] args) {
		//배열에서 최대값 찾기
		//1. 최대값 설정(maxVal) - 0번 인덱스
		//2. 전체를 반복하며 최대값과 비교
		//3. 최대값보다 클 경우, 그 값을 최대값으로 변경
		int[] arr = new int[] {1, 5, 8, 3, 2};
		int maxVal = arr[0];					//배열의 0번을 maxVal(최대값)으로 넣음
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > maxVal)
				maxVal = arr[i];				//arr[i]가 maxVal보다 크면 같아짐
		}
		/*
		 i=0			maxVal = 1
		 i=0   5 > 1,   maxVal = 5
		 i=0   5 > 5,   maxVal = 8
		 i=0   5 > 8,   maxVal = 8
		 i=0   5 > 8,   maxVal = 8
		 */		
		//최대값 출력
		System.out.println("최대값 : " + maxVal);
		
	}

}
