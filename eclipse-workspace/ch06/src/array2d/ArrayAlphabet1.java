package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		// for문 출력
		/*char c = 'A';
		System.out.println(c);		//A
		System.out.println((int)c); //c를 숫자로 형변환 = 65(A 아스키코드)
		
		char c2 = 66;
		System.out.println(c2);*/
		System.out.println("==== 일반 for문을 사용 알파벳 출력 ====");
		char c;
		for(c =65; c<=90; c++) {
			System.out.print(c + " ");		//A부터 Z
		}
		System.out.println("\n변수의 마지막 값 : " + (char)(c-1));
		
		
		System.out.println("");	//줄 바꿈
		
		
		System.out.println("==== 알파벳을 배열에 저장하고 출력 ====");
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//알파벳을 배열에 저장하고 1증가
		for(int i =0; i < alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		for(int i =0; i < alphabets.length; i++) {
			System.out.print(alphabets[i] + " ");
		}

		//alphabets[0] = ch;
		//System.out.println(alphabets[0]);	//A
		//alphabets[1] = (char)(ch+1);		//자바 덧셈 연산했을 때 int형으로 바뀌어서 char를 붙여 줌
		
		//ch++;								//ch = ch + 1 :1증가
		//alphabets[1] = ch;
		//System.out.println(alphabets[1]);
		}
		
		
	}


