package arraycopy;

public class BookName {

	public static void main(String[] args) {
		//1.일반 출력
		/*Book book1 = new Book("빠삐용", "베르나르");
		System.out.println(book1);
		System.out.println(book1.toString());*/
		
		//2.배열 | 2.주머니 3개 생성
		Book[] books = new Book[3];
		//주머니에 넣을 값 생성
		Book book1 = new Book("빠삐용", "베르나르");
		Book book2 = new Book("태백산맥", "조정래");
		Book book3 = new Book("미생", "장그래");
		
		//1주머니 1데이터 넣자(0,1,2)
		/*books[0] = book1;
		books[1] = book2;
		books[2] = book3;*/
		
		//3번째 주머니만 보자
		System.out.println(books[2]);
		
		//주머니 3개 전체 출력
		for(int i = 0; i<books.length; i++) {
			System.out.println(books[i].getBookName() + ", " + books[i].getAutor());
		}
	}

}
