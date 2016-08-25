package day03;

import java.util.Calendar;

public class CalendarDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Calendar cl = Calendar.getInstance();
		
		System.out.println(cl.getTime());
		/*
		 * 3年1个月零2天以后的那周的周一 是哪天？
		 * 
		 * void add(int field ,int value);
		 */
		
		
		cl.add(Calendar.YEAR, 3);
		cl.add(Calendar.MONTH, 1);
		cl.add(Calendar.DAY_OF_YEAR, 2);
		cl.set(Calendar.DAY_OF_WEEK, 2);
		
		System.out.println(cl.getTime());
		
		/**
		 * 要求用户输入一个日期 ，并对该日期进行一系列的计算后 
		 * 将计算后的日期再以指定的个数输入给用户
		 *
		 *String ---SimpleDateFormat-->Date
		 *Date --> Calendar
		 *使用Calendar进行相应的计算
		 *Calendar --> Date
		 *Date -- SimpleDateFormat --> String
		 * 
		 */
		
		
	}

}
