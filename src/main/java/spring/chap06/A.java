package spring.chap06;

public class A {

	B b;
	C c;
	
	
	@Override
	public String toString() {
		b.doB();
		c.doC();
		return "A [b=" + b + ", c=" + c + "]";
		
	}


	public void setB(B b) {
		this.b = b;
	}


	public void setC(C c) {
		this.c = c;
	}
	
	
	
}
