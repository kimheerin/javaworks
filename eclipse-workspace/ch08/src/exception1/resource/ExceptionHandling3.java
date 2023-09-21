package exception;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		//일반 예외 - 컴파일 오류(컴파일러 체크)
		try {
			Class.forName("java.lang.Math2");  //이 줄만 입력했을 때, 빨간줄이 뜨고 클릭하면 바로 소스가 형성됨
			System.out.println("찾는 클래스가 있습니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} finally {	//프로그램상 항상 실해앻야 할 경우 사용
			System.out.println("항상 수행함");
		}

	}

}
