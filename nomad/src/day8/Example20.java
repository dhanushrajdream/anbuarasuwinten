package day8;

public class Example20 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int mul=1;
		for(int i=2;i<=num;i++) {
			mul=mul*i;
		
			System.out.println(mul);
		}

	}
}
