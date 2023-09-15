package mathod;

public class MathTestTwo0908 {

	public static void main(String[] args) {
		
		
		// 주사위 10번 던지기
		/*for(int i=1; i<=10; i++) {
			int dice = (int)(Math.random()*6) + 1;		//String 배열 0부터
		
			System.out.println(dice);
		}*/

		
		//배열에서 문자열 랜덤 출력
		String[] word = {"i", "my", "me", "mine"};
		
		int idx = (int)(Math.random()*word.length);		//Math.random()*4도 가능 [배열 안에 개수]
		System.out.println(word[idx]);					//String 배열은 1이 아닌 0부터
		

		
		//전체 출력
		for(int i=0; i<word.length; i++) {
			System.out.print(word[i] + " ");
			
		
		}
		
		
		
		
	}//main

}//class
