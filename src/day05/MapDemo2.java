package day05;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历map有三种方式
 * 
 * 1：遍历所有的key
 * 2：遍历所有的键值对
 * 3：遍历所有的value（相对来说不常用）
 * 
 * 
 * @author root
 *
 */
public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String ,Integer> map = new HashMap<String , Integer>();

		
		
		map.put("warriors", 1);
		map.put("spu", 2);
		map.put("thunder", 3);
		map.put("clipper", 4);
		
		System.out.println(map);
		
		/**
		 * 
		 * Set<K> keySet()
		 * 将当前map中的所有key存入一个Set集合
		 * 并将集合返回
		 * 遍历这个set集合就等同与遍历了所有的key
		 * 
		 */
		
		Set<String> keySet = map.keySet();
		
		for(String x : keySet){
			System.out.println("key:"+x);
		}
		/**
		 * 
		 *  Set<Entry<K,V>> entrySet();
		 *  
		 *  将map转换为set
		 *  键值对 转换为 Entry
		 *  返回  
		 * 
		 * 
		 */
		
		Set<Entry<String,Integer>> entrySet = map.entrySet();
		for(Entry<String , Integer> x : entrySet){
			
			String key = x.getKey();
			Integer value = x.getValue();
			System.out.println(key+","+value);
			
			
			/**
			 * 
			 * Collection <Integer> values = map.values();
			 * 
			 */
			 Collection <Integer> values = map.values();
			 
			for(Integer i: values){
				
				System.out.println("value:"+i);
				
			}
			 
			
			
			
			
		}
		
		
		

	}

}
