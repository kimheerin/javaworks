package inheritance.airplane;
//자식 class
public class SuperAirPlane extends AirPlane {
	//1 - 일반 비행, 2 - 슈퍼비행
	static final int NOMALFLY = 1;		//final == 변하지 않는 값
	static final int SUPERFLY = 2;		
	
	int fly = NOMALFLY;					//기본 모드
	
	@Override //메서드 재정의(상속 받아서 다시 정의됨)
	public void 비행() {
		if(fly == 2) {
			System.out.println("슈퍼 비행 전환...");
		}else {
			super.비행(); 				//부모 메서드 상속
		}
	}
}
