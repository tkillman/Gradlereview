package spring.chap09;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

public class Annotation {
	
	// ���� �̸��� �������ش�. �� �̸��� �ٸ��ٸ� ���� ������ ����
	@Resource(name="a")
	A a;
	
	//���� Ÿ���� �������ش�.

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
