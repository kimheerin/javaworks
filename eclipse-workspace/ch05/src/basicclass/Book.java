package basicclass;

public class Book extends Object {
	int bookNum;		//책 번호
	String bookTitle;	//책 이름
	
	Book(int bookNum, String bookTitle){
		this.bookNum = bookNum;
		this.bookTitle = bookTitle;
	}
	//메소드 재정의 | book1.toString 출력 시, book1에 지정한 값이 나오게 하기
	@Override					//get, to info, toString? 3가지로 출력 가능
	public String toString() {	//소스 > 오버라이드 > toString
		return bookNum + ", " + bookTitle;	//int가 string으로 자동 형변환(반대로는 불가)
	}
}
