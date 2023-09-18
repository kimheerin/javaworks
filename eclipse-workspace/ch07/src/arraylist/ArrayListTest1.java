package arraylist;

import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		//배열 방법1
		//String[] carts = new String[4];
		//carts[0] = "사과"
		
		//배열 방법2
		//String[] carts = new String[]{"사과", "콩나물", "커피", "우유");
		
		//배열 방법3
		//리스트 공간이 기본 10개 생성
		//리스트 순서 0부터
		ArrayList<String> carts = new ArrayList<>();
		
		//자료 추가 - add()
		carts.add("사과");
		carts.add("콩나물");
		carts.add("바나나");	//중복 가능
		carts.add("우유");
		
		//자료 출력
		System.out.println(carts.get(0));
		System.out.println(carts.get(1));
		System.out.println(carts.get(2));
		System.out.println(carts.get(3));
		
		System.out.println("================================================");
		
		//리스트의 크기
		System.out.println("리스트의 크기 : " + carts.size());
		
		//자료 수정 - set()
		carts.set(2, "banana");
		
		//자료 삭제 - remove()
		//방법1
		//carts.remove(2);
		//방법2
		carts.remove("banana"); //직접 객체 이름을 넣어서
		
		//방법1. 전체 출력
		for(int i = 0; i<carts.size(); i++) {	//리스트를 처음부터 반복하면서
			String cart = carts.get(i);			//저장된 자료 1개를 가져와서 cart에 저장
			System.out.println(cart + " ");
		}
		System.out.println();
		
		//방법2. 전체 출력 | 향상된 for문 - 자료형 변수 : 리스트이름){}
		for(String cart : carts)
			System.out.println(cart);
	}

}
