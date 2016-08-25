package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 对集合的排序;
 * Collections 是集合的工具类，提供了很多操作集合的方法
 *其中的静态方法sort用来对List集合进行自然排序，及：从小到大
 * 
 * 而  Collection 是 所有集合的父接口  
 * 
 * @author root
 *
 */
public class SortCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		
		for(int i = 0 ; i< 10 ; i++){
			list.add(rand.nextInt(100));
			
		}
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
		
	}

}
