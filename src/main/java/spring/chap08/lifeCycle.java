package spring.chap08;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class lifeCycle {

	
	@PostConstruct
	public void postCons(){
		System.out.println("postCons() 메소드 실행");
	}
	
	public void inIt(){
		System.out.println("inIt() 메소드 실행");
	}
	
	
	@PreDestroy
	public void predes(){
		System.out.println("predes() 메소드 실행");
	}
	
	public void des(){
		System.out.println("des() 메소드 실행");
	}
	
	
}
