package abstracts.player;

public abstract class PlayerLevel {
	
	//추상 메서드
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	//템플릿 메서드
	public final void go(int count) {
		run();
		for(int i=0; i<count; i++) {	//count는 매개변수에서 받기
			jump();						//jump()는 횟수 있음
		}
		turn();
		
	}
}
