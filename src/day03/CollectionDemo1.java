package day03;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合
 * 
 * java.util.Collection
 * 该接口是所有集合的父类接口，规定了集合应当具有的
 * 相关方法
 * 
 * 
 * 
 * 其派生了两个子类接口
 * 
 * 
 * List：可重复集 有序集  可以根据下标操作元素
 * 
 * Set：不可重复集
 * 
 * 重复元素的判断标准是依靠元素自身equals比较的结果
 * 
 * 
 * 
 * @author root
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection  c = new ArrayList();
		
		/**
		 * 
		 * boolean add(E e);
		 */
		c.add("one");
		c.add("one");
		c.add("two");
		c.add("three");
		c.add("four");
		System.out.println(c);
		/**
		 * 
		 * int size();
		 * 返回但前集合的元素个数
		 * 
		 */
		System.out.println(c.size());
		/**
		 * 
		 * boolean isEmpty();
		 * 判断当前集合是否为空
		 */
		System.out.println(c.isEmpty());
		
		/**
		 * void clear();
		 * 
		 *  清空集合
		 */
		c.clear();
		System.out.println("集合已经清空");
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		
		
		
	}

}
