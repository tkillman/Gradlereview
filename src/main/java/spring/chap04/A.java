package spring.chap04;

public class A {
    
	private B b;
    int num;
	
    public A(){
    	System.out.println("기본 생성자 실행");
    }
    
    //B 객체를 얻는 껍대기 메소드를 정의
    public B getB(){
    	return null;
    }
    
    
	public void doA(){
		
		//정의되지 않은 getB()를 통해 b 객체를 얻고있다.
		
		b=getB();
		
		System.out.println("A클래스의 doA() 실행");
		System.out.println("num값" + num);
		System.out.println("b 객체 해쉬값 " + b);
		//A클래스에서 B의 객체의 메소드를 부르고 있다.
		//A는 B에 의존적이다.
		
		b.doB();
	}

	
	// property 사용 시  set 메소드가 반드시 필요하다.
	
	public void setB(B b) {
		this.b = b;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
}
