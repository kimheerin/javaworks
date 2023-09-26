package threads.synchronize;

public class WaitNotifyTest {

	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadA threadB = new ThreadA(workObject);
		
		threadA.start();
		threadB.start();

	}

}
