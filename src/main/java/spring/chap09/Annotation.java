package spring.chap09;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Annotation {
	
	// 같은 이름을 주입해준다. 단 이름이 다르다면 직접 지정도 가능
	@Resource(name="a")
	A a;
	
	//같은 타입을 주입해준다.

	B b;
	
	public void doAnnotation(){
		
		a.doA();
		b.doB();
	}

	
	public void setA(A a) {
		this.a = a;
	}
	
	@Autowired
	public void setB(B b) {
		this.b = b;
	}
	
	
	
}
