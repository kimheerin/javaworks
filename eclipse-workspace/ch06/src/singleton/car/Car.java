package singleton.car;

public class Car {
	//필드
	private static int serlaNum = 1000;	//기준 번호 - 클래스 변수
	private int carNum;					//차량번호 - 인스턴스 함수

	public Car() {
		serlaNum++;
		carNum = serlaNum;
	}
	
	//자동차 번호 출력
	public int getCarNum() {
		return carNum;
	}

}
