package manytomany;

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
		
		Student s1 = new Student();
		s1.setSid(1);
		s1.setName("miku");
		
		Student s2 = new Student();
		s2.setSid(2);
		s2.setName("shreya");

		Student s3 = new Student();
		s3.setSid(3);
		s3.setName("himanshu");
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("java");

		Course c2 = new Course();
		c2.setCid(2);
		c2.setCname("python");

		Course c3 = new Course();
		c3.setCid(3);
		c3.setCname("php");
		
		List<Course> s1_course  = new ArrayList<Course>();
		s1_course.add(c1);
		s1_course.add(c2);
		
		List<Course> s2_course  = new ArrayList<Course>();
		s2_course.add(c2);
		s2_course.add(c3);
		
		List<Course> s3_course  = new ArrayList<Course>();
		s3_course.add(c1);
		s3_course.add(c2);
		s3_course.add(c3);
		
		List<Student> c1_student = new ArrayList<Student>();
		c1_student.add(s1);
		c1_student.add(s3);
		
		List<Student> c2_student = new ArrayList<Student>();
		c2_student.add(s1);
		c2_student.add(s2);
		c2_student.add(s3);
		
		List<Student> c3_student = new ArrayList<Student>();
		c3_student.add(s2);
		c3_student.add(s3);
		
		s1.setCourses(s1_course);
		s2.setCourses(s2_course);
		s3.setCourses(s3_course);
		
		c1.setStu_list(c1_student);
		c2.setStu_list(c2_student);
		c3.setStu_list(c3_student);
		
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(c1);
		session.save(c2);
		session.save(c3);
		
		
		
		tx.commit();
		session.close();
		sf.close();
	}
}
