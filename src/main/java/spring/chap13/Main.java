package spring.chap13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext13.xml");
		CoreInterface core = (CoreInterface)context.getBean("core");
		
		core.doCore();
		
	}
	
}
