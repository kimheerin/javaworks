package whileexample;

public class WhileIBreak {

	public static void main(String[] args) {
		// 반복조건문
		// 1부터 10까지 출력
		
		int i = 0;
		
		while(true) { //무한 반복
			i++;
			System.out.print(i + " ");
			if(i == 10) { //중괄호 블럭은 실행문이 한 줄일 때 생략 가능
				break;	//탈출
			}	
		}
		
	}

}
