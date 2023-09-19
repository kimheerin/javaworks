package generic;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
		//Generic(일반화) 이전 코드 작성
		ArrayList cartList = new ArrayList();
		
		cartList.add("egg");	//0번
		cartList.add("coffee");	//1번
		
		String item = (String)cartList.get(0); 	//강제 형변환 필요함(다운캐스팅)
		System.out.println(item);
	
		System.out.println("---------------------------------------------------");
		
		//Generic(일반화) 현재 코드 작성 - 자바 1.5버전 이후
		//제네릭 프로그래밍 - 어떤 값이 하나의 자료형이 아닌 여러 자료형을 사용할 수 있도록
		//프로그래밍 하는 것을 말함
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("egg"); 	//0번
		list.add("coffee");	//1번
		
		String item2 = list.get(0);
		System.out.println(item2);
	}

}
