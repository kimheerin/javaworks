package bufferedstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("word.txt"))) {
			
			String data;
			String[] word = null;
			while((data = br.readLine()) != null) {
				word = data.split(" ");
			}
			Scanner sc = new Scanner(System.in);
			int n = 1; //문제 번호
			double start, end; //게임 시간
			System.out.println("타자 연습 게임 - 준비되면 [ENTER]");
			sc.nextLine();
			
			start = System.currentTimeMillis();	//게임 시간
			while(n<11) {	//10문제 (11일 때 빠져 나옴)
				System.out.println("문제" + n);	//"문제" 출력
				int rnd = (int)(Math.random()*word.length);	//0부터 9까지
				String ques = word[rnd];
				System.out.println(ques);	//문제 출제
				
				String ans = sc.nextLine();	//단어 입력
				
				if(ques.equals(ans)) {		//입력&문제 비교
					System.out.println("~~성공~~\n");
					n++;					//문제1 -> 문제2...
				}else {
					System.out.println("실패~~ 재도전!\n");
				}
			}
			end = System.currentTimeMillis();
			System.out.printf("게임 소요 시간 : %.2f초" + (end-start)/1000);
			sc.close();
				
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
