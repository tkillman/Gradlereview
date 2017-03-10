package spring.chap08;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class lifeCycle {

	
	@PostConstruct
	public void postCons(){
		System.out.println("postCons() �޼ҵ� ����");
	}
	
	public void inIt(){
		System.out.println("inIt() �޼ҵ� ����");
	}
	
	
	@PreDestroy
	public void predes(){
		System.out.println("predes() �޼ҵ� ����");
	}
	
	public void des(){
		System.out.println("des() �޼ҵ� ����");
	}
	
	
}
