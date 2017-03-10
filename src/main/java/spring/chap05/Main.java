package spring.chap05;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext05.xml");
		
		CollEx collEx = context.getBean("collEx",CollEx.class);
		
		
		//listValue�� ����� ��
		System.out.println("listValue�� ����� ��");
		System.out.println(collEx.listValue.get(2));
	
		//mapValue
		System.out.println("mapValue�� ����� ��");
		System.out.println(collEx.mapValue.get("keyName2"));
		
		//setValue
		System.out.println("setValue�� ����� ��");
		System.out.println(collEx.setValue.contains(98));
		
		//propValue
		//properties�� ? map���� key���� value���� ��� String
		System.out.println("propValue�� ����� ��");
		System.out.println(collEx.propValue.getProperty("keyP2"));
		
	}
	
	
}
