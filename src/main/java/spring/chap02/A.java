package spring.chap02;

public class A {
    
	private B b;
    int num;
		
	public A(B b, int num){
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
	
}
