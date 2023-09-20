package abstracts.player;

//고급자
public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("i run tooo fast");
		
	}

	@Override
	public void jump() {
		System.out.println("i can jump tooo high");
		
	}

	@Override
	public void turn() {
		System.out.println("i can turn");
		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*** Super ***");
		
	}

}
