package typinggame;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		//영어 단어가 랜덤하게 화면에 출제되면 타이핑 하기
		//오타 없으면 통과, 있으면 "재도전"
		//10 문제 수정
		//시간 측정
		
		String[] words = {"ant", "beer", "chicken", "cat", "dog", "elephant", "fox", "frog", "horse", "monkey", "tiger"};
		
		Scanner sc = new Scanner(System.in);
		int n = 1;	//문제 번호
		double start, end;	//게임 시간
		System.out.println("| 영어 타자 게임 | 준비가 완료되면 엔터 |");
		System.out.println("===============================");
		sc.nextLine(); //엔터
		
		start = System.currentTimeMillis();
		while(n < 11) {	//10문제	(11일 때 빠져나옴)
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n);	//"문제" 출력
		
			String question = words[rand];
			System.out.println(question);	//출제된 단어
			
			//단어 입력
			String answer = sc.nextLine();  //사용자 입력
	
			if(question.equals(answer)) {
				System.out.println("!!통과!!\n");
				n++;						//통과하면 다음 문제
			}else {
				System.out.println("!!재도전!!\n");
			}
		
		}
		end = System.currentTimeMillis();
		
		System.out.printf("게임 시간은 %.2f" + (end-start)/1000);
		
		
		sc.close();
	}//main

}
