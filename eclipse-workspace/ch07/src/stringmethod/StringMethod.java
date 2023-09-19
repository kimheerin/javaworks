package stringmethod;

public class StringMethod {

	public static void main(String[] args) {
		//문자열 다루기
		//문자열은 1차원 배열
		//해당 클래스의 문자를 리턴함
		String subject = "자바 프로그래밍";
		
		char ch = subject.charAt(1);	
		System.out.println(ch);
		
		//주민번호로 성별 구분
		String 주민번호 = "991028-2121212";
		
		char 성별 = 주민번호.charAt(7);
		switch(성별) {
		case '1' : case '3' :
			System.out.println("남자");
			break;
		case '2' : case '4' :
			System.out.println("여자");
			break;
		}
		
		//toString(첫문자, 끝문자) : 문자열을 추출하는 메서드 - (첫문자부터 끝문자-1)를 추출
		String 생년월일 = 주민번호.substring(0, 6);
		System.out.println(생년월일);
		
		String seconNum = 주민번호.substring(7);	//첫문자부터 마지막까지
		System.out.println(seconNum);
	}

}
