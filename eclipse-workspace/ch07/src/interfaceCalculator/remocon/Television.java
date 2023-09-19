package interfaceCalculator.remocon;

public class Television implements RemoconControl {
	
	//필드
	private int volume;
	
	@Override
	public void turnOn () {
		System.out.println("티비를 켭니다");
	}
	@Override
	public void turnOff () {
		System.out.println("티비를 끕니다");
	}
	@Override
	public void setVolume (int volume) {
		//volume 0~10 설정
		if(volume > RemoconControl.MAX_VOLUME) {
			this.volume = RemoconControl.MAX_VOLUME;
		}else if(volume < RemoconControl.MAX_VOLUME){
			this.volume = RemoconControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

}
