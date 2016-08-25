package day03;

import java.util.Calendar;

public class CalendarDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 表示  2008-08-08 20:08:08  
		 * 
		 * 
		 */
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2008);
		calendar.set(Calendar.MONTH,Calendar.AUGUST);
//		calendar.set(Calendar.DATE,32);
//		calendar.set(Calendar.HOUR_OF_DAY,20);
//		calendar.set(Calendar.MINUTE,8);
//		calendar.set(Calendar.SECOND,8);
		
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.SATURDAY);
//		calendar.set(Calendar.WEEK_OF_MONTH,Calendar.MONDAY);


		
		
		
		
		System.out.println(calendar.getTime());
		
	}

}
