package day9;

public class Ex13a {
	public static void main(String[] args) {
		char[] a=args[0].toCharArray();
		for(int i=args[0].length()-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
