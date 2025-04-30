package consambiguity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("consambiguity/core.xml");
		Data d =(Data)con.getBean("d");
		System.out.println(d);
	}
}
