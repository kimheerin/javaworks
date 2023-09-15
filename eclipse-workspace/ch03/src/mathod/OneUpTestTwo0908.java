package mathod;

public class OneUpTestTwo0908 {
	
	
	//항목 변수 - static 키워드를 붙인 변수
	static int x = 1; //전역 공간(위쪽)
	
	public static int oneUp() {
		x += 1;
		return x;
	}

	public static void main(String[] args) {
		System.out.println(oneUp()); //2
		System.out.println(oneUp()); //3
		System.out.println(oneUp()); //4
		
		//변수 x값 출력
		System.out.println("x : " + x);

	}

}
