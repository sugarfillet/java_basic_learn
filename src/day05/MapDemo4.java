package day05;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 有序的HashMap
 * 存储顺序 与迭代顺序  一致
 * 
 * 
 * @author root
 *
 */
public class MapDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String ,Integer> map = new LinkedHashMap<String , Integer>();
		map.put("语文",99);
		map.put("数学",39);
		map.put("英语",29);
		map.put("物理",69);
		
		
		Set<String> keySet = map.keySet();
		
		for(String key : keySet){
			System.out.println(key);
		}
		
		
		
		
		
		
	}

}
