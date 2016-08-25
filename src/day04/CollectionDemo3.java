package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历集合元素
 * 
 * Collecion提供了方法
 * 
 * Iterator iterator();
 * 该方法会返回一个可以遍历当前集合的迭代器实例
 * 
 * 
 * java.util.Iterator
 * 是迭代器接口
 * 规定了遍历集合的方法
 * 不同的集合实现类都实现了可以遍历自身的迭代器实现类
 * 我们无需记忆每个具体实现类 
 * 只要当作是Iterator看待 并可以遍历该集合即可
 * 
 * 
 * 迭代器遍历集合遵循：
 * 问，取，删
 * 其中删除不是必须的
 * 
 * 
 * 
 * @author root
 *
 */
public class CollectionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Collection c = new ArrayList();
		c.add("apple");
		c.add("banana");
		c.add("iphone");
		
		System.out.println(c);
		Iterator it = c.iterator();
		
		while(it.hasNext()){
			String s = (String) it.next();
			/*
			 * 在使用迭代器遍历集合的过程中
			 * 是不能通过集合的方法删除元素的
			 * 否则会报异常
			 * 
			 * 
			 */
			
			
			it.remove();
			System.out.println(c);
			
		}
		
		
		
	}

}
