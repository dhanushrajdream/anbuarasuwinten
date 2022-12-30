package day16;

public abstract class Arithmetic implements Calculation {
	public void add() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	public void sub() {
		int a=15;
		int b=5;
		System.out.println(a-b);
	}
	public void mul() {
		int a=4;
		int b=5;
		System.out.println(a*b);
	}
	public void div() {
		int a=15;
		int b=3;
		System.out.println(a/b);
	}
	public void mod() {
		int a=15;
		int b=8;
		System.out.println(a%b);
	}

}
