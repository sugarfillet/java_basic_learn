package day05Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDemo1 {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<Person>();

		list.add(new Person("song",22,100));
		list.add(new Person("miao",21,5000));
		list.add(new Person("aaa" ,200,500));
		list.add(new Person("zzz",21,50000));
		
		System.out.println(list);
		
		Comparator< Person>  com  = new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getSalary()-o2.getSalary();
			}};		
		
		Collections.sort(list,com);
		System.out.println(list);
	}
	

	
}
