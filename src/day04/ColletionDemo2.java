package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ColletionDemo2 {

	public static void main(String[] args) {

		Collection c1 = new ArrayList();
		
		c1.add("java");
		c1.add(".net");
		
		System.out.println(c1);
		
		Collection c2 = new HashSet();
		
		c2.add("c");
		c2.add("c++");
		c2.add("c");//set中不能放置重复元素
		c2.add("java");

		System.out.println(c2);
		/**
		 * 
		 * boolean addAll(Collection c );
		 * 
		 * 将给定集合中的所有元素添加到当前集合中
		 * 当执行完毕后， 当前集合元素数量发生了改变  
		 * 返回true
		 * 
		 * 
		 */
		c1.addAll(c2);
		System.out.println(c1);
		
		
		c2.addAll(c1);
		System.out.println(c2);
		//list中元素可以重复（各个元素equal）
		//set 不可重复
	
		/**
		 * boolean contians(Collection c);
		 * 判断当前集合是否包含参数集合中的所有元素
		 * 是true否false
		 * 
		 * 
		 */
		
		Collection c3 = new ArrayList();
		
		c3.add("java");
		c3.add(".net");
		
		System.out.println(c2.containsAll(c3));
		System.out.println(c1.containsAll(c3));
		
	/**
	 * 
	 * 
	 * boolean remove(Collection c );
	 * 删除 当前集合中 与 参数集合的交集元素
	 * 
	 */
	
		c1.removeAll(c2);
		System.out.println(c1);
	
	
		
	}

}
