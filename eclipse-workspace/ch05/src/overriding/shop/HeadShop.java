package overriding.shop;
//부모 class
public class HeadShop {
	
	public HeadShop() {}					//생성되어 있다는 거 인지
	
	public void 된장찌개() {
		System.out.println("된장찌개 : 7,000원");
	}
	public void 김치찌개() {
		System.out.println("김치찌개 : 7,500원");
	}
	public void 비빔밥() {
		System.out.println("비빔밥 : 8,000원");
	}
}
