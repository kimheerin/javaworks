package basicclass;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book(100, "개미");
		//book1. 햇을 때 나오는 것들 Object에서 상속됨 | public class Book extends Object
		System.out.println(book1.toString());
		
		//return할 소스
		/*String msg = "개미";*/
		String msg = new String("개미");	//book1에 지정한 값이 안 나오고 별개로 선언한 변수값만 출력됨
		System.out.println(msg.toString());
		
	}

}
