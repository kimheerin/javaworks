package whileexample;

import java.util.Scanner;

public class KeyRepeat {

	public static void main(String[] args) {
		// 'y'키 입력 : "계속 반복합니다."
		// 'n'키 입력 : "반복을 중단합니다."
		// 그 이외의 키 : "지원하지 않는 동작입니다."
		// 문자열 동등 비교 함수 : .equls()
		//String key = "y";
		Scanner sc = new Scanner(System.in);
				
		while(true) {
			System.out.print("계속 반복할까요? (Y/N) :" );
			String key = sc.nextLine();
			
			if(key.equals("Y")) {	//.equls() 문자가 일치하는 비교
				System.out.println("\n계속 반복합니다.");
			}
			else if(key.equals("N")) {
				System.out.println("반복을 중단합니다.");
				break;				
			}else {
				System.out.println("지원하지 않는 동작입니다.");
			}
			
			}

	}

}
