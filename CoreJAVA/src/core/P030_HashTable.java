package core;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P030_HashTable {
	public static void main(String[] args) {
		Map map = new Hashtable();
		map.put(1, "c");
		map.put(2, "c++");
		map.put("java", "java");
		map.put(4, "python");
		map.put(345.34, false);
		map.put(23,'q');
		map.put(1, "php");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
