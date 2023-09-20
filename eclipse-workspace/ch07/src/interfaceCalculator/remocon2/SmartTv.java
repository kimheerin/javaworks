package interfaceCalculator.remocon2;

import interfaceCalculator.remocon.RemoteControl;

public class SmartTv implements RemoteControl, Searchable {

	private int volume;
	
	@Override
	public void search(String url) {
		System.out.println(url + "를 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("티비를 끕니다");
	}
	@Override
	public void setVolume(int Volume) {
		//volume 0~10 설정
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
}
