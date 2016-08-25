package day04;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * 集合中删除元素
 * 
 * 
 * @author root
 *
 */
public class CollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection c = new ArrayList();
		
		c.add(new Point(1,2));
		c.add(new Point(3,4));
		c.add(new Point(5,6));
		c.add(new Point(3,4));

		System.out.println(c);
		
		Point p = new Point(3,4);
		
		c.remove(p);
		System.out.println(c);
		
		
		
		
		
		
	}

}
