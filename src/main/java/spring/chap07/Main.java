package spring.chap07;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	
		ApplicationContext context= new GenericXmlApplicationContext("applicationContext07.xml");
		A a = context.getBean("a", A.class);
		
		A a1 = context.getBean("a",A.class);
		
		if(a==a1){
			System.out.println("a와 a1은 같다");
		}else{
			System.out.println("a와 a1은 다르다");
		}
		
	}
	
}
