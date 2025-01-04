package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P029_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");
		map.put(2, "c++");
		map.put("java", "java");
		map.put(4, "python");
		map.put(345.34, false);
		map.put(23,'q');
		map.put(1, "php");
		map.put(null, 3453);
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
	}
}
