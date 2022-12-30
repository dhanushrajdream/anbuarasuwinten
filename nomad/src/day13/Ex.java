package day13;

public class Ex {
	public void add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("Add "+c);
	}
	 void sub() {
		int a=15;
		int b=5;
		int c=a-b;
		System.out.println("Sub "+c);
	}
	 void mul() {
		int a=4;
		int b=5;
		int c=a*b;
		System.out.println("Mul "+c);
	}
	 void div() {
		int a=15;
		int b=3;
		int c=a/b;
		System.out.println("Div "+c);
	}
	public static void main(String[] args) {
		Ex e=new Ex();
		e.add();
		e.sub();
		e.mul();
		e.div();
	}

}
