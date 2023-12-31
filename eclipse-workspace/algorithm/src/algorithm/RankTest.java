package algorithm;

public class RankTest {

	public static void main(String[] args) {
		// 순위 정하기
		// rank를 모두 1로 초기화
		// rank -> 3, 1, 4, 5, 2
		int[] score = {70, 90, 60, 50, 80};
		int[] rank = new int[5];			//순위 주머니(5개) | 0, 0, 0, 0, 0
		
		//이중 for(열, 행)
		for(int i=0; i<score.length; i++) {
			int count = 1;
			for(int j=0; j<score.length; j++) {
				if(score[i]<score[j]) {
					count++;
				}
			rank[i] = count;				//순위에 따른 저장
			}
		}
		/*
		 i=0 70<70, 70<90, 70<60, 70<50, 70<80 count=3 //2번 참 (1+1) + 5번 참 (2+1) = 3
		 i=1 90<70, 90<90, 90<60, 90<50, 90<80 count=1 //참 X = 1 
		 i=2 60<70, 60<90, 60<60, 60<50, 60<80 count=2 //4번 참 (1+1) = 2 
		 i=3 50<70, 50<90, 50<60, 50<50, 50<80 count=1 //참 X = 1 
		 i=4 80<70, 80<90, 80<60, 80<50, 80<80 count=3 //3번 참 (1+1) + 4번 참 (2+1) = 3
		 */
		//순위 출력
		for(int i=0; i<rank.length; i++) {
			System.out.print(rank[i] + " ");
		}
	}

}
