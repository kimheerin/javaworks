package array2d;

public class ArrayAlphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
		}

		//배열 요서 전체 출력
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++)
				System.out.print(alphabets[i][j] + " ");
		}
		System.out.println(); //행 바꿈
	}

}
