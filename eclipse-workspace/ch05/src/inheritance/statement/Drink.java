package inheritance.statement;
//부모 클래스
public class Drink {
	//protected 상수형만 사용 가능(접근 불가한 private 대체)
	protected String name;		//상품명
	protected int price;		//가격
	protected int count;		//수량
		
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	public int getTotalPrice() {			//'금액' 함수
		return price * count;				// 금액 = 가격 x 수량
	}	
	public static void printTitle() {		//표 제목 출력
		System.out.println("상품명\t가격\t수량\t금액");
	}
	public void printData() {				//결과 출력
		System.out.println(name + "\t" + price + "\t" +
							count + "\t" + getTotalPrice());
	}

}
