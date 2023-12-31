package inheritance.statement;
//자식 class
public class Alchol extends Drink{
	
	float alcper;	//알콜 도수
	
	public Alchol(String name, int price, int count, float alcper) {
		super(name, price, count); 		//부모
		this.alcper = alcper;			//자식
	}
	public static void printTitle() {		//표 제목 출력
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	@Override					//private 접근 불가 -> 접근제어자(protected) 사용
	public void printData() {	//결과 출력
		System.out.println(name + " " + "(" + alcper + ")" + "\t" + price +
							"\t" + count + "\t" + getTotalPrice());
	}
}
