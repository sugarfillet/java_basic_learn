package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Colletions 是集合的工具类
 * 提供了一组方法，可以讲现有的集合转换为线程安全的
 * 
 * ArrayList LinkedList Hashset HashMap 都不是线程安全的
 * 
 * 
 * 
 * @author tarena
 *
 */
public class SyncAPIDemo {

	public static void main(String[] args) {

		 List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("one");
		list.add("one");
		System.out.println(list);
		//转换为线程安全的List集合
		list = Collections.synchronizedList(list);
		Set<String> set = new HashSet<String>(list);
		//转换为线程安全的Set集合
		set = Collections.synchronizedSet(set);
		
		Map<String , Integer> map = new HashMap<String , Integer>();
		map.put("chinese", 64);
		map.put("chinese", 64);
		map.put("chinese", 64);
		System.out.println(map);
		map = Collections.synchronizedMap(map);
		/*
		 * 遍历集合通常会使用Iterator 
		 * 遍历集合时  不与线程安全的集合方法互斥，所以要执行维护  若不维护 遍历异常
		 * ：迭代器有一个特点  就是在 问取删 的过程中 不能通过集合的方法修改元素数量（删除元素）
		 * 
		 */
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			String s = it.next();
			list.remove("one");
		}
		System.out.println(list);
		
		
		
	/*	System.out.println(list);
		new Thread(){public void run(){
			for(int i = 0 ; i < 10;i++){
				
				Thread t = Thread.currentThread();
				System.out.println(t+"add "+i+"to list");
				list.add(String.valueOf(i));
			}
			
		}}.start();
		new Thread(){public void run(){
			for(int i = 10 ; i < 20;i++){
				Thread t = Thread.currentThread();
				System.out.println(t+"add "+i+"to list");
				list.add(String.valueOf(i));
			}
			
		}}.start();
		System.out.println(list);*/
	}
	

}
