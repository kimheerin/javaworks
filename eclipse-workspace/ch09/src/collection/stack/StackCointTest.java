package collection.stack;

import java.util.Stack;

public class StackCointTest {

	public static void main(String[] args) {
		// Stack 자료 구조의 객체 생성
		Stack<Coin> coinBox = new Stack<>();
		
		//코인 객체 생성
		Coin coin5000 = new Coin(5000);
		Coin coin100 = new Coin(100);
		Coin coin10 = new Coin(10);
		Coin coin1 = new Coin(1);
		
		//동전 넣기(저장) [5000 - 100 - 10 - 1]
		coinBox.push(coin5000);
		coinBox.push(coin100);
		coinBox.push(coin10);
		coinBox.push(coin1);
	
		//맨 위의 1이 꺼내짐
		int coin2 = coinBox.pop().getMoney();
		System.out.println(coin2);
		
		//전체 객체 출력(꺼내기) - 밖으로 나오면서 삭제[10 - 50 - 100 - 500]
		while(!coinBox.isEmpty()) {		//coinBox가 비어 있지 않으면
			Coin coin = coinBox.pop();
			System.out.println(coin.getMoney());
		}
	}

}
