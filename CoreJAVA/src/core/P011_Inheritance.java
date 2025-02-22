package core;

class A {
	A(){
		System.out.println("default cons in A");
	}
	public void classA() {
		System.out.println("class A");
	}
}

class B extends A {
	public void classB() {
		System.out.println("class B");
	}
}

class C extends B {
	public void classC() {
		System.out.println("class C");
	}
}
class D extends A{
	public void classD() {
		System.out.println("class D");
	}
}


public class P011_Inheritance {
	public static void main(String[] args) {
		B b = new B();
		b.classA();
		b.classB();

		C c = new C();
		c.classA();
		c.classB();
		c.classC();
		
		D d= new D();
		d.classA();
		d.classD();
	}
}
