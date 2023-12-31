package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTest0908 {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		//날짜 및 시간 포맷 설정 - "yyyy/MM/dd HH:mm:ss a"
		DateTimeFormatter dtFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		
		
		System.out.println(now.format(dtFormat));
		
		//날짜 설정
		LocalDate date = LocalDate.now();
		System.out.println(date);
		

		//시간 설정
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		
		//시간 포맷 설정
		DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss a");
		System.out.println(now.format(timeFormat));
		
		
		//특정 날짜 지정하기
		LocalDate startDay = LocalDate.of(2023, 8, 1);
		LocalDate today = LocalDate.of(2023, 9, 15);
		
		
		//지나온 날짜 계산하기
		long passedtime = ChronoUnit.DAYS.between(startDay, today);
		System.out.println(passedtime + "일이 지났습니다.");
	
		
	
	
	
	}//main

}//class
