package decorator.jsondata.string;

import java.util.Scanner;

public class Stringmethod {

	public static void main(String[] args) {
		//주민등록번호 - 문자의 길이 length()
		
		//String personId = "941005-23456780";
		
		Scanner sc = new Scanner(System.in);
		System.err.print("주민등록번호를 입력(-포함) : ");
		String personId = sc.nextLine();
		System.out.println(personId.length());
		
		//문자 추출 - subString()
		String yyyymmdd = personId.substring(0, 6);
		System.out.println(yyyymmdd);
		
		String secondNum = personId.substring(7);	//7번부터 끝까지 추출
		System.out.println(secondNum);
		
		//성별 구분 - charAt()
		char gender = personId.charAt(7);
		
		if(personId.length() == 14) {
			if(gender == '1' || gender == '3') {
				System.out.println("남자");
			}
			if(gender == '2' || gender == '4') {
				System.out.println("여자");
			}
		}else{
		System.out.println("잘못된 형식입니다.");
		}
	}

}
