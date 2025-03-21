package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P024_ArrayList {
	public static void main(String[] args) {
		ArrayList list  = new ArrayList();
		list.add(1);
		list.add("java");
		list.add(23432.343);
		list.add(false);
		list.add('s');
		list.add(2353453434l);
		list.add(1);
		System.out.println(list);
		list.add(123432);
		list.add(3454.45);
		list.remove(2);
		System.out.println(list);
		list.add(2,4565);
		System.out.println(list);
		System.out.println(list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
