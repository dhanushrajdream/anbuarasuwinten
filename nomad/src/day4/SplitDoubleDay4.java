package day4;

public class SplitDoubleDay4 {
	public static void main(String[] args) {
		String a=args[0];
		String[] b=a.split("#");
		double d1=Double.parseDouble(b[0]);
		double d2=Double.parseDouble(b[1]);
		System.out.println(d1+d2);
	}

}
