package spring.chap03;

public class A {
    
	private B b;
    int num;
	
    public A(){
    	System.out.println("�⺻ ������ ����");
    }
    
	public A(B b, int num){
		System.out.println("B b, int num ������ ����");
		this.b = b;
		this.num=num;
	}
    
    
	public void doA(){
		System.out.println("AŬ������ doA() ����");
		System.out.println("num��" + num);
		System.out.println("b ��ü �ؽ��� " + b);
		//AŬ�������� B�� ��ü�� �޼ҵ带 �θ��� �ִ�.
		//A�� B�� �������̴�.
		b.doB();
	}

	
	//set�� �ݵ�� �ʿ��ϴ�.
	
	public void setB(B b) {
		this.b = b;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
}
