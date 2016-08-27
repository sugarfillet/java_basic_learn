package day04Homework;

import java.util.ArrayList;
import java.util.Collection;

public class homework1 {
	public static void main(String[] args) {
		
		Collection<String>  list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");

		Collection<String>  list2 = new ArrayList<String>();
		
		list2.add("four");
		list2.add("five");
		list2.add("six");
		
		
		list.addAll(list2);
		System.out.println(list);
		
		Collection<String>  list3 = new ArrayList<String>();
		
		list3.add("five");
		list3.add("one");
		
		System.out.println(list.containsAll(list3));
		
		list.remove("two");
		System.out.println(list);
		
		
		
		
	
}
}
