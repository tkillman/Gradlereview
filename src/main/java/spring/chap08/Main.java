package spring.chap08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AbstractApplicationContext aContext  = new GenericXmlApplicationContext("applicationContext08.xml");
		lifeCycle lifeC = aContext.getBean("lifeCycle",lifeCycle.class);
		
		aContext.registerShutdownHook();
	
	}
	
}
