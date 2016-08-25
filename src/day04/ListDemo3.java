package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 *对Llist取子集
 * @author root
 *
 */
public class ListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = new ArrayList<Integer>();
		
		System.out.println(list);
		for(int i = 0 ;i < 10 ;i++){
			list.add(list.size(),i);
		}
		System.out.println(list);
		
		/*
		 * 
		 * List subList(int start ,int end);
		 * 返回  下标在start 到 end之间的 子list
		 * 
		 */
		List<Integer> sub = list.subList(3, 8);
		
		System.out.println(sub);
		
		/*
		 * 
		 * 将子集元素扩大10倍
		 * 
		 */
	
		for(int i  = 0 ; i < sub.size() ; i++){
			sub.set(i, sub.get(i)*10);
		}
		System.out.println(sub);

		/*
		 * 对子集元素的修改就是对原来集合相应元素的修改！
		 * 
		 */
		System.out.println(list);
		
	System.out.println(sub);
		
		sub = list.subList(2, 9);
		sub.clear();
		System.out.println(sub);
		System.out.println(list);
	}

}
