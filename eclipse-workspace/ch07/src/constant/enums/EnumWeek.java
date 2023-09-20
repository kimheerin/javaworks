package constant.enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		//system.out.println(week); //4
		
		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}
		System.out.println("Today is : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("I am going to the movies");
		}else if(today == Week.SATURDAY){
			System.out.println("I have to clean my room");
		}else {
			System.out.println("Hard Coding...");
		}
	}

}
