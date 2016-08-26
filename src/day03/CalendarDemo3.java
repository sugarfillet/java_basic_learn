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
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
//		calendar.set(Calendar.WEEK_OF_MONTH,Calendar.MONDAY);
//     [1, 2008, 7, 35, 4, 26, 239, 6, 4, 1, 1, 13, 58, 21, 720, 28800000, 0]
//		[1, 2008, 7, 35, 5, 26, 239, 3, 4, 1, 1, 13, 58, 21, 720, 28800000, 0]
//		[1, 2008, 7, 35, 5, 26, 239, 1, 4, 1, 1, 13, 58, 21, 720, 28800000, 0]
//		[1, 2008, 7, 35, 5, 24, 237, 1, 4, 1, 1, 13, 58, 21, 720, 28800000, 0]
		
		
		
		System.out.println(calendar.getTime());
		
	}

}
