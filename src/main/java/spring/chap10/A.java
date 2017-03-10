package spring.chap10;

import org.springframework.stereotype.Component;

@Component("a")
public class A {

	public void doA(){
		System.out.println("A 클래스 doA 실행");
	}
	
}
