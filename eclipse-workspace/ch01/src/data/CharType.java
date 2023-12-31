package data;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char, String
		// 복제 : alt + ctrl + 아래 방향키
		// ASCII(Americal Standard Code for ..)
		char alpha ='A';
		System.out.println(alpha); //A
		System.out.println((int)alpha); //65(아스키 코드값, 형변환)
		
		int alpha2 = 66;
		System.out.println(alpha2); //66
		System.out.println((char)alpha2); //B(문자형 변환)
		
		//유니코드 - 16bit - 2Byte
		char uniCode1 = '한';		//한 문자 홑따옴표
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';
		System.out.println(uniCode2);

		char uniCode3 = '\uAc00';
		System.out.println(uniCode3);
		
		
		
	}

}
