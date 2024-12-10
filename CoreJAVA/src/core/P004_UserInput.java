package core;

import java.util.Scanner;

class QQ{
	public void show() {
		System.out.println("show in QQ class");
	}
}
public class P004_UserInput {
	public static void main(String[] args) {
		String name = "java";
		System.out.println("main method");
		QQ q = new QQ();
		q.show();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter int value = ");
		int i = sc.nextInt();
		System.out.println("i = "+i);
//		
//		System.out.println("enter name : ");
//		String name = sc.next();
//		System.out.println(name);
		
		System.out.println("ener character : ");
		char c = sc.next().charAt(0);
		System.out.println(c);
		
	}
}
