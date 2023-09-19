package stringmethod;

public class StringMehod2 {

	public static void main(String[] args) {
		//indexOf() 검색에 도움
		//문자열이 시작되는 인덱스를 리턴
		String str = "Hello world Hello!";
		
		int val = str.indexOf("Hello");			//앞에서부터 찾음 0
		System.out.println(val);
		
		int val2 = str.lastIndexOf("Hello");	//뒤에서부터 찾음 12
		System.out.println(val2);

		int val3 = str.indexOf("OK");			//찾는 문자가 없으면 -1
		System.out.println(val3);
		
		//조건문 만들기
		String subject = "자바 프로그래밍";
		
		if(subject.indexOf("자바바") != -1) {		//자바가 검색이 되면
		System.err.println("자바와 관련된 책입니다.");	
		}else { //index가 == -1					//안 되면
			System.err.println("자바와 관련되지 않은 책입니다.");	
		}
	}

}
