package day03Homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import javax.xml.ws.WebEndpoint;

public class homework01 {

	public static void main(String[] args) throws ParseException {
	/*	Date date  = new Date();
		System.out.println(date);

		Calendar cl = Calendar.getInstance();
		cl.add(Calendar.DAY_OF_MONTH, 3);
		Date date1 = cl.getTime();
		System.out.println(date1);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String spldt = sdf.format(date);
		System.out.println(spldt);
		
	   */
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("input your birthday: (yyyy-MM-dd)");
		String input = scan.nextLine();
		SimpleDateFormat ff  = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = ff.parse(input);
		Date now = new Date();
		long time =Math.abs(birth.getTime() - now.getTime());
		int live = (int) (time/1000);	
		System.out.println("活了"+live+"秒");
		 live = (int) (live/60);	
		System.out.println("活了"+live+"分");
		live = (int) (live/60);	
		System.out.println("活了"+live+"小时");
		live = live/24;
		System.out.println("活了"+live+"天");
		live = live/7;
		System.out.println("活了"+live+"周");
		
		System.out.println("input : (yyyy-MM-dd)");
		String input2  = scan.nextLine();
		System.out.println("days");
		Date chan = ff.parse(input2);
		int input3 = scan.nextInt();
		Calendar cl = Calendar.getInstance();
		cl.setTime(chan);
		cl.add(Calendar.DAY_OF_YEAR, input3);
		cl.add(Calendar.WEEK_OF_YEAR, -2);
		cl.set(Calendar.DAY_OF_WEEK,Calendar.WEDNESDAY);
		System.out.println(cl.getTime());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
