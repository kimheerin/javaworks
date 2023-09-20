package abstracts.player;

public class Player {
	//playerLevel 참조, 필드
	private PlayerLevel level;
	
	public Player() {
		level = new Beginner();		//초보자 생성
		level.showLevelMessage();	//*** Beginner ***
	}
	
	//레벨을 업그레이드 하는 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;			//중급, 고급자를 위한 설정
		level.showLevelMessage();
	}
	
	//플레이어가 게임하는 메서드
	public void play(int count) {
		level.go(count);
	}
}
