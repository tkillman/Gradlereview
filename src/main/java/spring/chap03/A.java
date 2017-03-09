package spring.chap03;

public class A {
    
	private B b;
    int num;
	
    public A(){
    	System.out.println("기본 생성자 실행");
    }
    
	public A(B b, int num){
		System.out.println("B b, int num 생성자 실행");
		this.b = b;
		this.num=num;
	}
    
    
	public void doA(){
		System.out.println("A클래스의 doA() 실행");
		System.out.println("num값" + num);
		System.out.println("b 객체 해쉬값 " + b);
		//A클래스에서 B의 객체의 메소드를 부르고 있다.
		//A는 B에 의존적이다.
		b.doB();
	}

	
	//set가 반드시 필요하다.
	
	public void setB(B b) {
		this.b = b;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
}
