package sorting;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] numbers) {
		System.out.println("QuickSort ascending");
		
	}

	@Override
	public void decending(int[] numbers) {
		System.out.println("QuickSort decending");
		
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort입니다.");
	}
}
