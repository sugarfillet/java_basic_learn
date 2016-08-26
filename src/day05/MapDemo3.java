package day05;

import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String ,Integer> map = new HashMap<String,Integer>();
			map.put("chinese", 22);
		map.put("english", 12);
		map.put("history", 22);
		map.put("sprot", 22);
		
		
		System.out.println(map);
		
		
		/**
		 * 
		 * 是否包含指定的key
		 * boolean  contiansKey(Object k);
		 * 
		 * 
		 */
		boolean isContians = map.containsKey("pp");
		System.out.println(isContians);
		
		
	}

}
