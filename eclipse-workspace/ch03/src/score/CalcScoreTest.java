package score;

import java.util.Scanner;

public class CalcScoreTest {

	public static void main(String[] args) {
		//성적 처리 프로그램
		//입력 시 잘못된 입력이 있는 경우 - 예외 처리
		//try ~ catch 구분 사용
		Scanner sc = new Scanner(System.in);
		boolean sw = true; //상태 변수
		int studentCount = 0; //학생 수
		int[] scores = null;
		
		while(sw) {
			try {
				System.out.println("============================================");
				System.out.println("1. 학생 수 | 2. 점수 | 3. 목록 | 4. 분석 | 5. 종료");
				System.out.println("============================================");
				
				//문자를 숫자로 변환(String, Integer(객체로 써야 할 때) -> int)
				int menu = Integer.parseInt(sc.nextLine());			//String menu = sc.nextLine() 으로 하고 if(menu == "1")로 해도 됨
				
				if(menu == 1) {
					System.out.print("학생 수 : ");
					studentCount = Integer.parseInt(sc.nextLine());
					scores = new int[studentCount]; //학생 수는 배열의 크기다.
					
				}else if(menu == 2) {	//배열에 함수 저장
					for(int i=0; i < scores.length; i++) {
						System.out.println("scres[" + i + "]");
						scores[i]=Integer.parseInt(sc.nextLine());
					}
					
				}else if(menu == 3) { //입력한 점수 목록 출력
					for(int i=0; i < scores.length; i++) {
						System.out.println("scores[" + i + "]=" + scores[i]);
					}
		
				}else if(menu == 4) { //통계 분석
					int sumVal = 0;
					double avg;
					int maxVal = scores[0];
					
					for(int i=0; i < scores.length; i++) {
						sumVal += scores[i];
						if(scores[i] > maxVal)
							maxVal = scores[i];
					}
					avg = (double)sumVal /  scores.length;
						System.out.printf("평균 점수 : %.2f\n", avg);
						System.out.println("최고 점수 : " + maxVal);
					
				}else if(menu == 5) {
					sw = false;
					
				}else {
					
					System.out.println("지원하지 않는 기능입니다.");
				}		
				}catch(Exception e) {//오류 처리
						System.out.println("입력이 올바르지 않습니다. 숫자를 입력하세요.");
		}
		
			
			
		
		}//while 끝
		System.out.println("프로그램 종료");
		sc.close();
	}//main

}
