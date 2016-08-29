package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * 删除Map元素的操作
 * V remove(K k)
 * 
 * 
 * @author root
 *
 */
public class MapDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> map  = new HashMap<String,Integer>();
		
		map.put("语文",99);
		map.put("数学",92);
		map.put("英语",93);
		map.put("物理",98);
		
		System.out.println(map);
		
		Integer value = map.remove("语文");
		System.out.println(map);
		System.out.println(value);
		
		
		
	}

}
