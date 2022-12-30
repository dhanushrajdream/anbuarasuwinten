package day13;

public class Ex2 {
	public String text () {
		return "HELLO WORLD";
	}
	public char letter() {
		return 'C';
	}
	public int add() {
		int a=20;
		int b=10;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		Ex2 e=new Ex2();
		System.out.println(e.text());
		System.out.println(e.letter());
		System.out.println(e.add());
	}
}