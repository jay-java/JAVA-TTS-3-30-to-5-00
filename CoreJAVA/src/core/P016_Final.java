package core;

final class AA{
	final int i = 1;
	final public void change() {
//		i++;
		System.out.println(i);
		System.out.println("change in A class");
	}
}
class BB extends AA{
	public void change() {
		System.out.println("change in B class");
	}
}
public class P016_Final {
	public static void main(String[] args) {
		AA a = new AA();
		a.change();
	}
}