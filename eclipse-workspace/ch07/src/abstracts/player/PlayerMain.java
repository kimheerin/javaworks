package abstracts.player;

public class PlayerMain {

	public static void main(String[] args) {
		//Player 인스턴스 생성
		Player player = new Player();
		player.play(0);
		
		//중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(1);
		

	}

}

