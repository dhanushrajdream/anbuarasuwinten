package day15;

public class Overloading {
	public int marks(int a,int b) {
		return a+b;
	}
	public int marks(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Overloading o=new Overloading();
		System.out.println(o.marks(20,30));
		System.out.println(o.marks(10,20,30));
	}

}
