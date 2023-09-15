package arraycopy;

public class Book {
	private String bookName;
	private String author;
	
	//Deep 카피 할 때 기본 생성자 만들어서
	public Book() {}
	
	public Book(String bookName, String author) {	//() 매개변수가 있어서 set ㄴㄴ 바로 get
		this.bookName = bookName;
		this.author = author;
	}	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAutor() {
		return author;
	}
	//객체의 문자열 정보 재정의
	@Override
	public String toString() {
		return bookName + ", " + author;
		//Book book1 = new Book("빠삐용", "베르나르"); << 이거를 문자로 나오게 하기 위한 소스
		
	}
}

