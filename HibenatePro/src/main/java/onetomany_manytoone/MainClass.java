package onetomany_manytoone;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		

		User2 u = new User2();
		u.setId(1);
		u.setName("java");
		u.setContact(98765321);
		
		Address2 a = new Address2();
		a.setAid(1);
		a.setHno(10);
		a.setArea("Ahmedabad");
		
		Address2 a1 = new Address2();
		a1.setAid(2);
		a1.setHno(11);
		a1.setArea("Delhi");
		
		List<Address2> list = new ArrayList<Address2>();
		list.add(a1);
		list.add(a);
		
		u.setAddress(list);
		a.setUser(u);
		a1.setUser(u);
		
		session.save(u);
		session.save(a);
		session.save(a1);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
