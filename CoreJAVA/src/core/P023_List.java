package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P023_List {
	public static void main(String[] args) {
		List list  = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(23432.343);
		list.add(false);
		list.add('s');
		list.add(2353453434l);
		list.add(1);
		System.out.println(list);
		list.add(123432);
		list.remove(2);
		System.out.println(list);
		list.add(2,4565);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("is exists : "+list.contains(1));
		System.out.println("list is : "+list.isEmpty());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
