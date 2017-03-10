package spring.chap02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import spring.chap01.Test;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = 
		 new GenericXmlApplicationContext("applicationContext02.xml");
		 A a = context.getBean("a",A.class);
		 
		 a.doA();
		
	}
	
}
