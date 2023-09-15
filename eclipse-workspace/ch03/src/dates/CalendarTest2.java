package dates;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {


		Calendar cal = Calendar.getInstance();
		
		//지나온 시간 측정
		//1970. 1. 1. 자정 이후부터 측정 - 밀리초
		//유닉스 시스템 소프트웨이 개시된 시간
		// 1/1억(ns) > 1/백만(마이크로츠) >  1/1000초(ms) > 1초(s)
		long passedTime = cal.getTimeInMillis();
		System.out.println(passedTime);
		
		//밀리초를 일로 환산
		passedTime = passedTime/(24*60*60*1000);
		System.out.println(passedTime);
		
		//시작일, 종료일 객체 생성
		Calendar startDay = Calendar.getInstance();	//시작일
		Calendar today = Calendar.getInstance();	//종료일
		
		startDay.set(2023, 9, 1);
		today.set(2023, 9, 15);
		
		//초로 계산
		long betweenTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		
		//일로 환산
		betweenTime = betweenTime/(24*60*60*1000);
		System.out.println(betweenTime + "일 지났습니다.");
		
	}

}
