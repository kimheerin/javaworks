package singleton;

public class Company {
	//싱글톤 코딩 디자인 패턴 사용
	//멤버 변수가 객체 인스턴스
	//static을 사용하면 new로 생성하지 않음
	private static Company instance;		//멤버 변수(필드)
	
	private Company() {} 					//생성자 private 사용

	public static Company getInstance() {	//new 안 써서 static, 클래스명 사용
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
