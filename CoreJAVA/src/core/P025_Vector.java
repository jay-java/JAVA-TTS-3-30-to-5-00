package core;

import java.util.Enumeration;
import java.util.Vector;

public class P025_Vector {
	public static void main(String[] args) {
		Vector list = new Vector();
		list.add(1);
		list.add("java");
		list.add(23432.343);
		list.add(false);
		list.add('s');
		list.add(2353453434l);
		list.add(1);
		System.out.println(list);
		Enumeration em = list.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
