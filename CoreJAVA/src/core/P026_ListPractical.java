package core;

import java.util.ArrayList;
import java.util.List;

class Laptop{
	int ram;
	String model;
	double price;
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int ram, String model, double price) {
		super();
		this.ram = ram;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", model=" + model + ", price=" + price + "]";
	}
	
}
public class P026_ListPractical {
	public static void main(String[] args) {
		Laptop l1 =new Laptop(8, "dell", 98787.32);
		Laptop l2 =new Laptop(10, "asus", 98787.32);
		Laptop l3 =new Laptop(12, "lenovo", 98787.32);
		Laptop l4 =new Laptop(16, "acer", 98787.32);
		
		List<Laptop> list = new ArrayList<Laptop>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		
		for(Laptop l: list) {
			System.out.println(l);
		}
		
		
	}
}
