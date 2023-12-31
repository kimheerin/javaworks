package arraycopy;

public class DeepCopy {

	public static void main(String[] args) {
		Book[] array1 = new Book[3];
		Book[] array2 = new Book[3];
		
		array1[0] = new Book("빠삐용", "베르나르");
		array1[1] = new Book("태백산맥", "조정래");
		array1[2] = new Book("미생", "장그래");

		//기본생성자로 array2 객체 생성
		array2[0] = new Book();
		array2[1] = new Book();
		array2[2] = new Book();
		
		//array1 -> array2 복사(get,set)
		for(int i=0; i<array1.length; i++) {
			array2[i].setBookName(array1[i].getBookName());
			array2[i].setAuthor(array1[i].getAutor());
		}
		
		//array1(원본)의 첫번째 요소 수정
		array1[0].setBookName("어쩌고");
		array1[0].setAuthor("윤태호");
		
		System.out.println("== array1 출력 ==");
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i].toString());
		}	
		System.out.println("== array2 출력 ==");
		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i].toString());
		}
		
		//b.clone 복사
		Book[] array3 = array2.clone();
		System.out.println("== array3 출력 ==");
		for(int i=0; i<array3.length; i++) {
			System.out.println(array3[i].toString());
		}
		
		//c.향상 for문 복사
		//for(자료형 변수 : 배열 이름){변수 출력}
		System.out.println("== array3 출력 ==");
		for(Book arr3 : array3) {
			System.out.println(arr3.toString());
		}
		
	}

}
