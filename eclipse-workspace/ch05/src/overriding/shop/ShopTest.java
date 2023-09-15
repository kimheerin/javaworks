package overriding.shop;

public class ShopTest {

	public static void main(String[] args) {
		//매장 객체(인스턴스) 생성
		Shop1 shop11 = new Shop1();		//Shop1 역세권 매장 출력, 그 안에 오버라이드 출력 
		shop11.김치찌개();
		shop11.된장찌개();
		shop11.비빔밥();
		System.out.println("=================");
		Shop2 shop22 = new Shop2();		//위 주석과 동일
		shop22.김치찌개();
		shop22.된장찌개();
		shop22.비빔밥();
	}

}
