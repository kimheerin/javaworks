package eontinueexam;

public class ContinueTest {

	public static void main(String[] args) {
	//1. break문 - 1~10까지 자연수 중 1~5까지 출력
		for(int i =1; i<=10; i++) {
			if(i > 5) {
				break;
			}
			System.out.println(i);
		}
	//2. continue문 - 1~10까지 자연수 중 5 제외
	//반복되다가 continue를 만나면 이후 코드를 실행하지 않고 조건식이나
	//증감식으로 수행한다.
		for(int i =1; i<=10; i++) {
			if(i == 5 || i == 8) {
				continue;	//if() --> 5, 8 되면 다시 올라감 나머지는 내려가서 출력됨
			}
			System.out.print(i);
		}
		
	}
}
