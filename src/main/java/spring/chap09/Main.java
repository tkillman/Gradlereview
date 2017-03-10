package spring.chap09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext09.xml");
		Annotation annotation =context.getBean("annotation",Annotation.class);
		
		annotation.doAnnotation();
		
	}
	
}
