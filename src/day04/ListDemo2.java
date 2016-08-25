package day04;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list = new LinkedList<String>();
		
		/**
		 * void add(E e );
		 * 只是在末尾添加
		 * void add(int index , E e);
		 *可以在任意位置添加0....list.size()
		 * 
		 */
		
		list.add("warrior");
		list.add("spur");
		list.add("thunder");
		list.add("clipper");
		list.add("blazer");
		
		System.out.println(list);
		
//		list.add("laker");
		
		list.add(1, "laker");
		System.out.println(list);
		
		
		
		
		/**
		 *
		 * E e remove(int index);
		 * 删除指定的元素 并返回
		 * 
		 * delete();
		 * 
		 */
		String str = list.remove(1);
		System.out.println("element deleted:"+str);
		System.out.println(list);
		
		
		
		
		
		
		
		
	}

}
