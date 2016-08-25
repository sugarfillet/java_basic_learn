package day03;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		
		
		
//		Date date = new Date();
		Date date = calendar.getTime();
		
		System.out.println(date);
		
		/**
		 * date -> Calendar
		 * 
		 * Calendar 提供了方法
		 * void setTime(Date date)
		 * 
		 * 该方法可以使当前Calendar表示给定的
		 * date所表示的时间
		 * 
		 */
		calendar.setTime(date);
		
		System.out.println(calendar);
		
	}
	
	
}
