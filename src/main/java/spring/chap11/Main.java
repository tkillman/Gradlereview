package spring.chap11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext11.xml");
		B b = (B)context.getBean("b");
		
		b.doB();
		
	}
	
}
