package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * 数组转换为集合
 * 
 * 需要注意，转换依靠数组的工具类Arrays的方法
 * 该方法仅能将数组转化为List集合 保证可重复数据也能转换
 * 
 * 
 * @author root
 *
 */
public class ArrayToListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] array = new String []{"11","22","33","44"};
		
		List<String> list = Arrays.asList(array);
		
		System.out.println(list);
		
		/**
		 * 对转换后的集合元素修改，就是对原来数组的相应元素的修改
		 * update is ok
		 * add is no
		 * remove is no
		 * 
		 */
		
		list.set(1, "two");
//		list.add("wrong");
//		list.remove(1)
		System.out.println(list);
		System.out.println(array[1]);

		
		/**
		 * 新建一个list1  并添加要添加的元素
		 * 
		 *
		 * 
		 */
		ArrayList<String> list1 = new ArrayList<String>();
		list1.addAll(list);
		list1.add("tha i want to append");
		list1.set(1,"that i want to reset");
		System.out.println(list1);
		
		
		
		
		
		
		
	}

}
