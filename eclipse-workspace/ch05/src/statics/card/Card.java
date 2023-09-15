package statics.card;

public class Card {
	//1. 필드
	private static int serialNum = 10000;	//클래스 변수
	private int cardNum;					//인스턴스 변수(new 사용)

	public Card() {	//생성할 때마다 카드번호 1 증가
		serialNum++;
		cardNum = serialNum;
	}
	
	public int getCardNum() {
		return cardNum;
	}
}
