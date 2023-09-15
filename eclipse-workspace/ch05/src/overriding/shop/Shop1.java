package overriding.shop;
//자식 class
public class Shop1 extends HeadShop {			//같은 패키지므로 import 필요 X
	public Shop1() {
		System.out.println("*역세권 매장");
	}
	@Override									//우클릭 > source > override implement 
	public void 된장찌개() {
		System.out.println("된장찌개 : 7,500원");	//@override : 이미 재정의되어서 super 필요 X
	}

	@Override
	public void 김치찌개() {
		System.out.println("김치찌개 : 8,000원");	
	}

	@Override
	public void 비빔밥() {
		System.out.println("비빔밥 : 8,500원");
	}
	

}
