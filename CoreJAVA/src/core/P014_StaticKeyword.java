package core;

class Student{
	static {
		System.out.println("static block in student class");
	}
	int id;
	String name;
	double per;
	static String c_name = "XYZ";
	Student(int id,String name,double per){
		this.id= id;
		this.name = name;
		this.per=per;
	}
	public void showData() {
		System.out.println("id : "+id+"name : "+name+" per : "+per+" c name : "+c_name);
	}
	public static void call() {
		System.out.println("call");
	}
	
}
public class P014_StaticKeyword {
	static {
		System.out.println("static block in main class");
	}
	public static void main(String[] args) {
		Student s1 = new Student(1,"java", 63.10);
		s1.showData();
		s1.call();
		Student.call();
	}
}