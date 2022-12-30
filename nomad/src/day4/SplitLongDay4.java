package day4;

public class SplitLongDay4 {
	public static void main(String[] args) {
		String a=args[0];
		String[] b=a.split("@");
		long l1=Long.parseLong(b[0]);
		long l2=Long.parseLong(b[1]);
		System.out.println(l1+l2);
		
		
	}

}
