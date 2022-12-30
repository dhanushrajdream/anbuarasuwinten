package day4;

public class SplitFloatDay4 {
	public static void main(String[] args) {
		String a=args[0];
		String[] b=a.split("/");
		float f1=Float.parseFloat(b[0]);
		float f2=Float.parseFloat(b[1]);
		System.out.println(f1-f2);
	}
}
