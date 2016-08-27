package day04Homework;

import java.util.ArrayList;
import java.util.List;

public class homework3 {

	public static void main(String args[]) {

		List<String>  ll = new ArrayList<String>();
		
		ll.add("one");
		ll.add("two");
		ll.add("three");
		ll.add("four");
		
		System.out.println(ll.get(1));
		
		ll.set(3, "3");
		ll.add(1, "2");
		
		ll.remove(2);
		System.out.println(ll);
		
	}
}
