package singleton.car;

public class CarFactory {
	private static CarFactory instance;
	
	
	private CarFactory() {}
	
	public static CarFactory getInstans() {
		if(instance == null) {
			instance = new CarFactory() ;
		}
		return instance;
	}
	
	//자동차 생성
	public Car createCar() {
		Car car = new Car();
		return car;
	}

}