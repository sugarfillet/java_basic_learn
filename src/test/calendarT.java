package test;
/**
 * 
 * 设置当前时间为 2008.8.8 20:08
 * 
 * a question:
 * Calendar  getTime() 方法的实现
 *            fields [] 属性 变为 date
 * 
 * date()<-time
 * time <？- fields[]
 * ？is an abstract method
 * 
 * Calendar.getInstance() 默认创建一个 geligaolili的实例
 * 
 * GregorianCalendar  是 Calendar 的 子类
 * 实现的  computeTime()方法
 * 
 * 
 * 
 * 
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class calendarT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		GregorianCalendar
		Calendar cl = Calendar.getInstance();
		
//		System.out.println(cl);
		
		getFields(cl);
		System.out.println(cl.getTime());
		System.out.println("------------------------------------------");
		
//		System.out.println(cl.getTimeInMillis());
		
//		Date d = new Date(cl.getTimeInMillis());
//		System.out.println(d);
		
		/**
		 * q:设置时间为2008.8.8
		 * 
		 */
		cl.set(Calendar.YEAR, 2008);
		System.out.println("设置year为2008");
		getFields(cl);
		System.out.println(cl.getTime());
		System.out.println("------------------------------------------");
		
		
//		cl.set(Calendar.MONTH, 7);
//		getFields(cl);
//		System.out.println(cl.getTime());
//		System.out.println("------------------------------------------");
		
		cl.set(Calendar.DAY_OF_MONTH, 8);
		System.out.println("设置dayOfMonth为8");
		getFields(cl);
		System.out.println(cl.getTime());
		System.out.println("------------------------------------------");
		
		cl.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
		System.out.println("设置八月的第二个周");
		getFields(cl);
		System.out.println(cl.getTime());
		System.out.println("------------------------------------------");
		
		cl.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		System.out.println("设置dayOfWeek为wed(4)");
		getFields(cl);
		System.out.println(cl.getTime());
		System.out.println("------------------------------------------");
		
		
		
		
	
		
		
		
		
		
		
		
	}
	public static void getFields(Calendar cl){
		
		String tmp = cl.toString();
		String regex = ",";
		String [] clDtls = tmp.split(regex) ;	
		String [] result = new String[8];
		System.arraycopy(clDtls, 13, result, 0, result.length);

		
		for(int i = 0 ; i < result.length ;i ++){
			System.out.print(" "+result[i]);
			
				System.out.println();
			
			
		}
		System.out.println();
	}
}
