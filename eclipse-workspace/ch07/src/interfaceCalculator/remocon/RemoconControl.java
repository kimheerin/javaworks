package interfaceCalculator.remocon;
//부모
public interface RemoconControl {
	
	//인터페이스 함수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 10;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int Volume);
	
	//정적 메서드
	static void ChangeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	//일반(구체화) 메서드 - default 키워드를 붙임
	default void setMute(boolean mute) {
		if(mute == true) {
			System.out.println("무음 처리");
		}else {	//mute == false
			System.out.println("무음 해제");
		}
	}
	
	
}
