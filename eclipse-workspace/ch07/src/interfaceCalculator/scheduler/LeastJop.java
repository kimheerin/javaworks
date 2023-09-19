package interfaceCalculator.scheduler;

public class LeastJop implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 가져오기");

	}
	@Override
	public void senCallToAgent() {
		System.out.println("현재 상담 업무가 없거나 대가가 적은 " + "상담원에게 할당합니다.");
		
	}

}
