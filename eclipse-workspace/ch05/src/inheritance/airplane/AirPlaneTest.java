package inheritance.airplane;

public class AirPlaneTest {

	public static void main(String[] args) {
		SuperAirPlane sa = new SuperAirPlane();

		sa.이륙();
		sa.비행();		
		sa.fly = SuperAirPlane.SUPERFLY; //모드 변경
		sa.비행();		
		sa.fly = SuperAirPlane.NOMALFLY; //static 붙으면 클래스명.변수명
		sa.비행();
		sa.착륙();
	
	
	}

}
