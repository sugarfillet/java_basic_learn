package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * java.util.Map
 * 查找表  以key-value对的形式存储数据
 * 在Map中key是不允许重复的（Equals比较）
 * 一个key对应一个value
 * 常用的Map实现类：HashMap，使用散列算法实现
 * 
 * 
 * @author root
 *
 */
public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String ,Integer> map = new HashMap<String , Integer>();
		/**
		 * V put(K k ,V v);
		 * 将给定的key-value存入到Map中
		 * 
		 * 因为
		 * Map不允许有重复的key，
		 * 所以若给定Key已经存在，这是替换value 返回 old  value
		 * 若不存在   就是 添加新的键值对  返回 null
		 * 
		 * 
		 */
		map.put("chinese", 19);
		map.put("math", 19);
		map.put("english", 19);
		Integer num = map.put("pe", 22);
		System.out.println(num);
		System.out.println(map);

		 num = map.put("pe",33);
		System.out.println(num);
		System.out.println(map);

		/**
		 * V get(K k);
		 * 
		 * k.exist()?k->v:null
		 * 
		 * 
		 */
		num = map.get("chinese");
		System.out.println(num);

		num = map.get("");
		System.out.println(num);

		
		
		
	}

}
