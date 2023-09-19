package sorting;

public class BubbleSort implements Sort {

	@Override
	public void ascending(int[] numbers) {
		System.out.println("BubbleSort ascending");
		
	}

	@Override
	public void decending(int[] numbers) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort입니다.");
	}

}
