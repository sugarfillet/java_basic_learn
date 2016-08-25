package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.util.SimpleDateFormat
 * 
 * 该类可以根据一个指定的日期格式将Date与String
 * 之间进行相互转换
 * 
 * 
 * @author root
 *
 */
public class SimpleDateFormateDemo {
	
	public static void main(String args[]){
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str = sdf.format(now);
		System.out.println(str);
		
	}
	

}
