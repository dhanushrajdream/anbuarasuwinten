package day13;

public class All {
	public void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Add "+c);
	}
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println("Sub "+c);
	}
	public int mul() {
		int a=4;
		int b=5;
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
		
		All a=new All();
		a.add();
		a.sub(20,10);
		System.out.println("Mul "+a.mul());
		System.out.println("Div "+a.div(20,4));
		
	}

}
