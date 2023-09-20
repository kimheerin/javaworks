package interfaceCalculator.remocon2;

import interfaceCalculator.remocon.RemoteControl;

public class SmartTvTest {

	public static void main(String[] args) {
		//구현 객체(인스턴스) - tv
		SmartTv tv = new SmartTv();
		
		//구현 인스턴스를 인터페이스 타입에 저장(자동 형변환)
		RemoteControl rc = tv;
		Searchable searchable = tv;

		rc.turnOn();
		rc.setVolume(8);
		searchable.search("www.naver.com");
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.ChangeBattery();
	}

}
