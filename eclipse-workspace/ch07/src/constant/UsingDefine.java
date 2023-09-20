package constant;

public class UsingDefine {

	public static void main(String[] args) {
		//static이 있는 상수는 클래스명으로 직접 접근
		System.out.println("최대값 : " + Define.MAX);
		System.out.println("최소값 : " + Define.MIN);

		System.out.println("수학 과목 코드 : " + Define.MATH);
		System.out.println("영어 과목 코드 : " + Define.ENG);
		
		System.out.println("원주율 : " + Define.PI);
		System.out.println("원주율 : " + Math.PI);	//정밀한 값 math는 jdk 생성
		
		System.err.println(Define.GOOD_MORNING);
	}

}
