package singleton.car;

public class CarTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstans();
		
		Car mySonata = factory.createCar();
		Car yourMorning = factory.createCar();
		
		System.out.println("신차 번호 : " + mySonata.getCarNum());
		System.out.println("신차 번호 : " + yourMorning.getCarNum());

	}

}
