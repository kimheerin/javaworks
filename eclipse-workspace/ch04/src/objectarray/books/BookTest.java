package objectarray.books;

public class BookTest {

	public static void main(String[] args) {
		//Book[] lib = new Book[3];
		
		/*for(int i=0; i<lib.length; i++) {
			System.out.println(lib[1]);
		}*/
		
		/*객체 생성(1) - 배열에 저장
		lib[0] = new Book("사과의 정석", "김지은");
		lib[1] = new Book("바나나의 정석", "이지은");
		lib[2] = new Book("망고의 정석", "박지은");*/
		
		//객체 생성(2)
		Book[] lib = {
			new Book("사과의 정석", "김지은"),
			new Book("바나나의 정석", "이지은"),
			new Book("망고의 정석", "박지은")
		};
		
		//출력
			lib[0].showBookInfo(); 	//void일 때임 sysout 금지 (이미 출력했으니까)
			//System.out.println(lib[0].showBookInfo()); //String일 때임
			System.out.println("=============================");
		
		//전체 출력
		for(int i=0; i<lib.length; i++) {
			lib[i].showBookInfo(); 	//void일 때임 sysout 금지 (이미 출력했으니까)
			//System.out.println(lib[i].showBookInfo()); //String일 때임
		}
		System.out.println("=============================");
		
		//향상된 for문
		//for(자료형 변수 : 배열)
		for(Book book : lib) {
			//System.out.println(book.showBookInfo()); //String일 때임
			book.showBookInfo();					//void일 때임
		}
	}

}
