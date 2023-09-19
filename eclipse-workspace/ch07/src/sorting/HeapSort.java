package sorting;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] numbers) {
		System.out.println("HeadSort ascending");
		
	}

	@Override
	public void decending(int[] numbers) {
		System.out.println("HeadSort decending");
		
	}
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort입니다.");
	}

}
