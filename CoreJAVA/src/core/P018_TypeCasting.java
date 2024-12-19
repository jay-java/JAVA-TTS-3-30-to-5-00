package core;

import java.util.Scanner;

public class P018_TypeCasting {
	public static void main(String[] args) {
		
		int q = 12;
		Integer i1 = new Integer(12);
		
		
		int i = (int)1.3;
		System.out.println(i);
		double d = 3;//implicit
		System.out.println(d);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int aa = a/b;
		System.out.println(aa);
		double c = (double)a / (double)b;
		System.out.println(c);
		
		String s = "1";
		int n1 = Integer.parseInt(s);
		System.out.println(n1);
		String s1 = "3.14";
		double d1 = Double.parseDouble(s1);
		System.out.println(d1);
		
		int p = 13;
		String ss = String.valueOf(p);
		System.out.println(ss);
		
		
	}
}
