package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		

		User1 u = new User1();
		u.setId(1);
		u.setName("java");
		u.setContact(98765321);
		
		Address a = new Address();
		a.setAid(1);
		a.setHno(10);
		a.setArea("Ahmedabad");
		
		u.setAddress(a);
		a.setUser(u);
		
		session.save(u);
		session.save(a);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
