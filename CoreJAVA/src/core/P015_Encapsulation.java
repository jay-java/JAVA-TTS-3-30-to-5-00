package core;

class User {
	private int id;
	private String name;
	private String address;
	private long contact;

	public User() {

	}

	public User(int id, String name, String address, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public long getContact() {
		return contact;
	}
 
	@Override
	public String toString() {
		return "id : " + id + " name : " + name + " address : " + address + " contact : " + contact;
	}
}
class DB{
	public static void insertUser(User u) {
		System.out.println(u);
	}
}

public class P015_Encapsulation {
	public static void main(String[] args) {
		User u1 = new User();
		u1.setId(1);
		u1.setName("java");
		u1.setContact(987654);
		u1.setAddress("ahmedabad");
//		System.out.println(u1.getId());
//		System.out.println(u1.getName());
		System.out.println(u1);
		User u2 = new User(2, "python", "delhi", 9876543);
//		System.out.println(u2.getId());
//		System.out.println(u2.getName());
		System.out.println(u2);
		
		DB.insertUser(u2);
		
		
	}
}
