package day6;

public class Practice5a {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if (a>b && a>c) {
			System.out.println("a is the high salary");
		}
		else if (b>a && b>c) {
			System.out.println("b is the high salary");
		}
		else {
			System.out.println("c is the high salary");
		}
	}

}
