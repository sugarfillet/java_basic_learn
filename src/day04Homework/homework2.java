package day04Homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class homework2 {

	public static void main(String[] args) {
		
		Collection<String>  c = new ArrayList<String>();
		
		c.add("1");
		c.add("$");
		c.add("2");
		c.add("$");
		c.add("3");
		c.add("$");
		c.add("4");
		
		Iterator  it = c.iterator();
		while(it.hasNext()){
			if("$".equals(it.next())){
				it.remove();
			}
			
		}
		

	  it = c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}
}
