package core;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P028_TreeSet {
	public static void main(String[] args) {
		Set set = new TreeSet();
		set.add(1);
		set.add(45645);
		set.add(-35435);
		set.add(1334);
		set.add(-98);
		set.add(0);
		set.add(12);
		System.out.println(set);
		Iterator itr  = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
