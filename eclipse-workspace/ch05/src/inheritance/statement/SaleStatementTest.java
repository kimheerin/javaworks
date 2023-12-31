package inheritance.statement;

public class SaleStatementTest {

	public static void main(String[] args) {
		//Drink class 사용
		Drink coffee = new Drink("커피", 3000, 3);
		Drink 녹차 = new Drink("녹차", 2000, 4);
		Alchol beer = new Alchol("맥주", 5000, 10, 7.5f);
		Alchol soju = new Alchol("소주", 1200, 20, 18.5f);
		//Drink 전표 출력
		Drink.printTitle();		//표 제목
		coffee.printData();		//결과
		녹차.printData();
		
		System.out.println("=====================================");
		
		//Alchol 전표 출력
		Alchol.printTitle();
		beer.printData();
		soju.printData();
		
		//합계
		int sumVal = coffee.getTotalPrice() + 녹차.getTotalPrice() +
					beer.getTotalPrice() + soju.getTotalPrice();
		System.out.println("\n********* 합계 금액 : " + sumVal + "원 *********");

	}

}







