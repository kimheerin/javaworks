package abstracts.player;

//중급자
public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("I run fast");
		
	}

	@Override
	public void jump() {
		System.out.println("I can jump high");
		
	}

	@Override
	public void turn() {
		System.out.println("i can't turn");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** Advanced ***");
		
	}

}
