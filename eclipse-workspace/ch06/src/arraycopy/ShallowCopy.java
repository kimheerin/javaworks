package arraycopy;

public class ShallowCopy {

	public static void main(String[] args) {
		//Book, BookName에서 가져옴
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("빠삐용", "베르나르");
		array1[1] = new Book("태백산맥", "조정래");
		array1[2] = new Book("미생", "장그래");
		
		//array1의 첫번째 주머니[0] 수정
		array1[0].setBookName("어쩌고");
		array1[0].setAuthor("윤태호");
		System.out.println("== array1 출력 ==");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}

	
		//a. 일반복사 | array1 복사하기
		for(int i=0; i<array1.length; i++) {
			array2[i] = array1[i];						//이걸 문자로 출력해야 하니까 toString
		}
		//출력
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		
	}

}
