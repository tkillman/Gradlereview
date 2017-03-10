package spring.chap10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext10.xml");
		A a = context.getBean("a",A.class);
		
		//@Component
		a.doA();
		
		//@Configuration , @Bean
		C c = context.getBean("c",C.class);
		c.doC();
		
		
	}
	
}
