package threads.beepprint;

import java.awt.Toolkit;

public class BeepPrintTest {

	public static void main(String[] args) {
		//싱글 스레드 - 메인 스레드만 실행
		
		//"띵" 문자 5번 출력
		//Thread.sleep(1000) : 1초 간격 - 대기 시간
		
		for(int i=1; i<=5; i++) {
			System.out.println("띵");
			try { 					//예외 처리
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		//"띵" 소리 5번 재생
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i<=5; i++) {
			toolkit.beep();
			try { 
				Thread.sleep(500);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
