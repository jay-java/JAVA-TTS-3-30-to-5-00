package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {

	SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	Session session = sf.openSession();
	Transaction tx = session.beginTransaction();

	public void insertUser(User u) {
		session.save(u);

		tx.commit();
		session.close();
		sf.close();
	}

	public User getUserById(int id) {
		return session.get(User.class, id);
	}

	public void updateUser(User u) {
		session.update(u);
		tx.commit();
		session.close();
		sf.close();
	}

	public void deleteUser(int id) {
		User u = session.get(User.class, id);
		session.delete(u);
		tx.commit();
		session.close();
		sf.close();
	}
	
	public List<User> getAllUsers(){
		String hql = "from User";
//		String hql = "from User u where u.email=:email and u.password=:password";
		Query q = session.createQuery(hql);
//		q.getParameter(1, u.get)
		List<User> list = q.list();
		return list;
	}

}
