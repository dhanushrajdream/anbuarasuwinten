package day11;

public class Ex2 {
	public static void main(String[] args) {
		int a=60;
		int b=40;
		for(int i=a;i>=b;i--) {
			if(i%2==0 && i%3==0) {
				System.out.println("BOTH 2 and 3 DIVISIBLE");
			}
			else if (i%2==0) {
				System.out.println("2 divisible");
			}
			else if (i%3==0) {
				System.out.println("3 divisible");
			}
			else {
				System.out.println("not divisible");
			}
			
		}
	}

}
