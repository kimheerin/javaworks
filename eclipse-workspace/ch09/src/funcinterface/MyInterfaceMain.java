package funcinterface;

public class MyInterfaceMain {

	public static void main(String[] args) {
		
		MyFunction1 func;
		
		//람다식 표현으로 추상 메서드를 구현
		//매개변수 없음
		//코드가 한 줄인 경우 {} 생략
		/*func =() -> {
			System.out.println("안 녕");
		};*/
		
		func = () -> System.out.println("안 녕");
		
		//실행 함수 호출
		func.method();
	}

}
