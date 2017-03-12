package spring.chap12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext12.xml");
		Core core = (Core)context.getBean("core");
		core.doCore();
		
	} 
	
}
