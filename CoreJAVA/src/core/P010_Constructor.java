package core;

class AAA {

}

class Data {
	int i;
	String name;

	Data() {
		System.out.println("default cons on data class");
	}

	Data(int i) {

	}

	Data(String name) {

	}

	Data(int i, String name) {
		this.i = i;
		this.name = name;

		System.out.println("value in cons : i = " + i + " name = " + name);
	}

	Data(Data d1) {
		this.i = d1.i;
		this.name = d1.name;
	}

	public void call() {
		System.out.println("call in data class");
	}

	public void show() {
		System.out.println("value in show fun : i = " + i + " name = " + name);
	}
}

public class P010_Constructor {
	public static void main(String[] args) {
		Data d = new Data();
		d.call();
		d.show();

		Data d1 = new Data(10, "java");
		d1.show();

		Data d2 = new Data(d1);
		d2.show();
	}
}