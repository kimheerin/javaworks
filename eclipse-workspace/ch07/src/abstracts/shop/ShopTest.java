package abstracts.shop;

public class ShopTest {

	public static void main(String[] args) {

		HeadShop shop1 = new Shop1(); //HeadShop이 안 되는 이유.. 추상 클래스는 생성 안 됨
		shop1.된장찌개();
		shop1.김치찌개();
		shop1.비빔밥();
		
		System.out.println("====================================");
		
		HeadShop shop2 = new Shop2();
		shop2.된장찌개();
		shop2.김치찌개();
		shop2.비빔밥();
	}
}

