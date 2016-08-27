package day03Homework;

import java.util.ArrayList;
import java.util.Collection;

import org.omg.Messaging.SyncScopeHelper;

public class homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> c =  new ArrayList<String>();
		c.add("one");
		c.add("two");
		c.add("three");
		
		
		int size = c.size();
		boolean  isContianFour = c.contains("four");
		c.clear();
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		
		
		
		
	}

}
