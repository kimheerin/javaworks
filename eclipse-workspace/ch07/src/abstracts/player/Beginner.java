package abstracts.player;

//초급자
public class Beginner extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("i am running too slow");
		
	}

	@Override
	public void jump() {
		System.out.println("i can't jump");
		
	}

	@Override
	public void turn() {
		System.out.println("i can't turn");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** Beginner ***");
		
	}

}
