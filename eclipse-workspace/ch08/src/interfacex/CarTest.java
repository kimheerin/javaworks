package interfacex;

public class CarTest {

	public static void main(String[] args) {
	
		System.out.println("==== 인스턴스 ====");
		 
		Car myCar = new Car();
		//myCar.run();
		
		//앞 바퀴 교체(변경)
		//방법1
		KumTire kum1 = new KumTire();
		KumTire kum2 = new KumTire();
		myCar.frontLeftTire = kum1;
		myCar.frontRightTire = kum2;
		//방법2
		/*myCar.frontLeftTire = new KumTire();
		myCar.frontRightTire = new KumTire();
		*/
		myCar.run();
		
		System.out.println("==== 배열 ====");
		
		Car2 myCar2 = new Car2();
		
		//앞 바위 교체(변경)
		myCar2.tires[0] = new KumTire();
		myCar2.tires[1] = new KumTire();
		
		myCar2.run();
		
	
	}

}
