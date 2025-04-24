package setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext con = new ClassPathXmlApplicationContext("setterInjection/core.xml");
		User u= (User)con.getBean("u");
		System.out.println(u);
	}
}
