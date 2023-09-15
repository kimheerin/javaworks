package objectarray.books;

// book 자료형 정의
public class Book {
	//필드
	private String bookName;
	private String author;
	
	//생성자
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
		
		
	}
	public String showBookInfo() {
		//System.out.println(bookName + " ," + author);	//void일 때
		return bookName + "," + author; 	//String일 때
	}
}
