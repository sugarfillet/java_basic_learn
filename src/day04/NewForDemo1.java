package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 新循环  增强for循环  foreach
 * 
 * 新循环 并非 新的语法
 * 是JDK1.5以后推出的
 * 一个新的特性
 * jre的编译器是认可的
 *作用：迭代遍历 数组 或 集合
 * 
 * 新循环 会在编译之后   被修改为  相应的 fori   或者  iterator
 * 
 * 
 * 
 * 
 * 
 * @author root
 *
 */
public class NewForDemo1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * foreach 遍历 数组
		 */
		String[] str = {"one","two","three"};
		for(int i = 0 ; i < str.length ; i++){
			
			System.out.println(str[i]);
			
		}
		
		
		int i= 0;
		for(String x : str){
			System.out.println(i++ + ""+x);
		}
		/**
		 * 
		 * foreach 遍历  set/list
		 * 
		 * 
		 * 
		 * 
		 */
		Collection c = new ArrayList();
		c.add("111");
		c.add("222");		
		c.add("333");
		
		Iterator it = c.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			System.out.println(s);
		}
		
		for(Object o : c){
			String s = (String)o;
			System.out.println(s);
		}
		
	}

}
