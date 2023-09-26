package threads.synchronize;

public class WorkObject {
	
	public synchronized void methodA() {
		//현재 실행중인 스레드 객체 생성
		Thread thread =  Thread.currentThread();
		System.out.println(thread.getName() + ": 작업 실행");
		notify();		//다른 스레드를 실행 대기 상태로 만듦(알림)
		try {
			wait();		//자신은 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public synchronized void methodB() {
		//현재 실행중인 스레드 객체 생성
		Thread thread =  Thread.currentThread();
		System.out.println(thread.getName() + ": 작업 실행");
		notify();		//다른 스레드를 실행 대기 상태로 만듦(알림)
		try {
			wait();		//자신은 일시 정지 상태로 만듦
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
