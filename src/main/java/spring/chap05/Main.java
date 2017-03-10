package spring.chap05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext05.xml");
		
		CollEx collEx = context.getBean("collEx",CollEx.class);
		
		
		//listValue에 저장된 값
		System.out.println("listValue에 저장된 값");
		System.out.println(collEx.listValue.get(2));
	
		//mapValue
		System.out.println("mapValue에 저장된 값");
		System.out.println(collEx.mapValue.get("keyName2"));
		
		//setValue
		System.out.println("setValue에 저장된 값");
		System.out.println(collEx.setValue.contains(98));
		
		//propValue
		//properties란 ? map에서 key값과 value값이 모두 String
		System.out.println("propValue에 저장된 값");
		System.out.println(collEx.propValue.getProperty("keyP2"));
		
	}
	
	
}
