package day04;

import java.util.LinkedList;
import java.util.List;

/**
 * java.util.List
 * 
 * List 集合是可重复集 并且有序
 * 特点是通过下表访问操作元素
 * 
 * 常用实现类：
 * ArrayList: 数组实现，查询性能更好
 * LinkedList：链表实现，增删性能更好，尤其首尾增删
 *
 * 
 * @author root
 *
 */
public class ListDemo1 {

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		/*
		 * boolean add(E e);
		 * 
		 * insert
		 * 
		 */
		list.add("spur");
		list.add("celtics");
		list.add("warriors");
		list.add("thunder");
		/*
		 * E get(int inex);
		 * 获取指定位置的元素
		 * query
		 */
		System.out.println(list.get(2));

		/*
		 * E set(int index ,E e);
		 * 将给定元素设置到指定位置，
		 * 返回值为原来位置对应的元素
		 * update
		 */
		String old = list.set(3, "雷霆");
		System.out.println(list);
		System.out.println(old);
		
		/**
		 * 
		 * List 提供了一对重载的add delete方法
		 * 
		 */
		
		
		
	}
	
	
	
}
