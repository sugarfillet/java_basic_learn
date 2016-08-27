package day05Homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<String, Integer>();

		m.put("语文", 99);
		m.put("数学", 98);
		m.put("英语", 97);
		m.put("物理", 96);
		m.put("化学", 90);

		System.out.println(m);

		System.out.println(m.get("物理"));
		System.out.println(m.put("化学", 0));
		System.out.println(m.remove("英语"));
		
		System.out.println(m);
		
		Set<String> keys = m.keySet();
		System.out.println(keys);
		
		Set<Entry<String,Integer>> entry = m.entrySet();
		System.out.println(entry);

		Collection<Integer> values =  m.values();
		System.out.println(values);
		
		
			
			
		
		
		
		

	}

}
