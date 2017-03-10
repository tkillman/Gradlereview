package spring.chap06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext06.xml");
		A a =context.getBean("a",A.class);
		System.out.println(a);
	
		
	}
	
}
