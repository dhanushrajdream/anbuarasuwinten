package day13;

public class Ex1 {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("Add "+c);
	}
	void sub(int a,int b) {
		int c=a-b;
		System.out.println("Sub "+c);
	}
	void mul(int a,int b) {
		int c=a*b;
		System.out.println("Mul "+c);
	}
	void div(int a,int b) {
		int c=a/b;
		System.out.println("Div "+c);
	}
	public static void main(String[] args) {
		Ex1 e=new Ex1();
		e.add(20,10);
		e.sub(25,15);
		e.mul(4,5);
		e.div(25,5);
	}

}
