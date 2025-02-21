package core;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	int emp_id;
	String name;
	double salary;
	String addres;

	Employee(int emp_id, String name, double salary, String address) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
		this.addres = address;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", salary=" + salary + ", addres=" + addres + "]";
	}
}

public class P021_Serialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee e1 = new Employee(1, "java", 98789.230, "ahmedabad");
		
//		FileOutputStream fos = new FileOutputStream("emp.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(e1);
//		oos.flush();
//		oos.close();
//		System.out.println("done");
		
		
		FileInputStream fis  = new FileInputStream("emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee miku = (Employee)ois.readObject();
		System.out.println(miku);
	}
}
