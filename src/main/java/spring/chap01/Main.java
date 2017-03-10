package spring.chap01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = 
		 new GenericXmlApplicationContext("applicationContext01.xml");
		Test test = context.getBean("test",Test.class);
		
		test.doTest();
		
	}
	
}
