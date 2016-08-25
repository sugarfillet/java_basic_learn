package day04;

import java.util.ArrayList;
import java.util.Collection;

public class ListToArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> c = new ArrayList<String>();
		
		c.add("11");
		c.add("22");
		c.add("33");
		c.add("44");
		
		
		System.out.println(c);
		
		String[] str = c.toArray(new String[c.size()]);
		
		
		for(String x : str){
			System.out.println(x);
		}
		
		
	}

}
