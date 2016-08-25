package day03;

import java.util.Date;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		/*
		 * Date  重写了ToString 方法
		 * 但是显示的日期格式对非英语地区不十分友好 
		 * 
		 */
		System.out.println(date);
		
	}

}
