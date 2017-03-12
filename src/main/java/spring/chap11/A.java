package spring.chap11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class A {
	B b;
	
	@Bean(name="b")
	public B createB(){
		B b = new B();
		
		return b;
	}
	 
	
	
	
}
