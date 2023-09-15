package ifexample;

public class LimitSpeedTest {

	public static void main(String[] args) {
		// if문
		// 제한 속도(limitSpeed) 50이면 "제한 속도 위반"
		/*
		   if(비교문){	//비교문이 true일 때 실행문을 작동함
		   실행문1;
		   }else{ //false
		   실행문2;
		 */
		
		int limitSpeed = 40;
		
		/* 단독 if문
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반! 과태료 10만 원 부과 대상");
		}*/
		
		//if ~ else 구문
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반! 과태료 10만 원 부과 대상");
		}else {
			 System.out.println("안전 속도 준수!");
		}
		
		System.out.println("현재 시속 " + limitSpeed + "km");
		
		
	}

}
