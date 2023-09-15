package forexample;

public class ForEx1 {

	public static void main(String[] args) {
		/*
		 for(초기값; 조료값; 증감값){
		 	실행문
		 }
		 */
		
		
		// 1 ~ 10 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
		
		
		
		/*아스키 코드값 알파벳 출력
		'A' - 65, 'a' - 97, 0 - 48*/
		char alpha = 'A';
		System.out.println(alpha); 				//(1)기본 문자		
		int val = 66;
		System.out.println((char)val); 			//(2)아스키 코드값 - (char)
		
		
		
		//영어 아스키 코드값 (65 ~ 123)
		/*for(int num=65; num<=91; num++) {		//(1)A의 코드값 65부터 .... ]의 코드값 91까지
			System.out.print((char)num + " ");
		}*/
		System.out.println();					//줄바꿈

		for(char ch=65; ch<123; ch++) {			//(2)위보다 더 쉬운 식
			System.out.print(ch + " ");
		}	
		System.out.println();					//줄바꿈
		
		
		
		//한글 유니코드 값(12593 ~ 12686)
		for(char ch=12593; ch<12686; ch++) {
			System.out.print(ch + " ");
		
		}
		
		//for(int ch=65; ch<=96; ch++) {

		//}
		
	}

}
