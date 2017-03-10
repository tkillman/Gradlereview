package spring.chap10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class B {
	
	
	@Bean(name="c")
	public C createC(){
		C c = new C();
		return c;
		
		
	}
	
	
}
