package core;

import java.util.Scanner;

class Overload {
	public int add(int a, int b) {
		return a + b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public double add(int a, double d) {
		return a + d;
	}
}

class Parent{
	public void call() {
		System.out.println("call in parent");
	}
}
class Child extends Parent{
	public void call() {
		super.call();
		System.out.println("call in child");
	}
}


public class P012_Polymorphism {
	public static void main(String[] args) {
		Overload o = new Overload();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		int res = o.add(a, b);
		System.out.println(res);
		
		Child c = new Child();
		c.call();
	}
}
