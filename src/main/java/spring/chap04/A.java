package spring.chap04;

public class A {
    
	private B b;
    int num;
	
    public A(){
    	System.out.println("�⺻ ������ ����");
    }
    
    //B ��ü�� ��� ����� �޼ҵ带 ����
    public B getB(){
    	return null;
    }
    
    
	public void doA(){
		
		//���ǵ��� ���� getB()�� ���� b ��ü�� ����ִ�.
		
		b=getB();
		
		System.out.println("AŬ������ doA() ����");
		System.out.println("num��" + num);
		System.out.println("b ��ü �ؽ��� " + b);
		//AŬ�������� B�� ��ü�� �޼ҵ带 �θ��� �ִ�.
		//A�� B�� �������̴�.
		
		b.doB();
	}

	
	// property ��� ��  set �޼ҵ尡 �ݵ�� �ʿ��ϴ�.
	
	public void setB(B b) {
		this.b = b;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
}
