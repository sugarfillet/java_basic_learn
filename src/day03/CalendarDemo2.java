package day03;

import java.util.Calendar;

public class CalendarDemo2 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = calendar.get(Calendar.MONTH)+1;
		
		System.out.println(month);
		
		/**
		 * 与天相关的时间分量
		 * 
		 * 
		 * DATE , DAY_OF_MONTH 表示月中天
		 * 
		 * DAY_OF_YEAR	表示年中天		
		 * 		
		 * 
		 * DAY_OF_WEEK		表示周中天
		 * 
		 */
		
//		int day = calendar.get(Calendar.DAY_OF_MONTH);
//		int day = calendar.get(Calendar.DATE);
//		int day = calendar.get(Calendar.DAY_OF_YEAR);
		/**
		 * 一周的第一天是周日
		 * 
		 */
		int day = calendar.get(Calendar.DAY_OF_WEEK)-1;
		String [] data = {"日","一","二","三","四","五","六"};
		System.out.println("周"+data[day]);

		int h =  calendar.get(Calendar.HOUR_OF_DAY);
		int m = calendar.get(Calendar.MINUTE);
		int s = calendar.get(Calendar.SECOND);
		
		System.out.println(h+":"+m+":"+s);
		
		
	}

}
