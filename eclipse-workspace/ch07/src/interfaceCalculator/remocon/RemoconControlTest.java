package interfaceCalculator.remocon;

public class RemoconControlTest {

	public static void main(String[] args) {
		//인터페이스형 부모 타입으로 객체 생성 - 자동 형변환
		RemoconControl rcTv = new Television();
		
		rcTv.turnOn();
		rcTv.setVolume(-11);
		rcTv.setMute(true);
		rcTv.setMute(false);
		rcTv.turnOff();
		
		//건전지 교체
		RemoconControl.ChangeBattery();

	}

}
