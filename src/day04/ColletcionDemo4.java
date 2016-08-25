package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColletcionDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> c = new ArrayList<String>();
		
		c.add("spur");
		c.add("warrior");
		c.add("thunder");
//		c.add(true);

		/**
		 * 
		 * 迭代器的泛型与其遍历的集合泛型一致即可
		 * 
		 * 
		 */
		Iterator<String> it = c.iterator();
		
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
		
		
		
	}

}
