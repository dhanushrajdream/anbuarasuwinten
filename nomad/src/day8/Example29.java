package day8;

public class Example29 {
	public static void main(String[] args) {
		String name="WELCOME TO MIRACLE WORLD";
		String[] n=name.split(" ");
		String n1=n[0].concat(n[1]);
		String n2=n[2].concat(n[3]);
		String n3=n1.concat(n2);
		char[] a=n3.toCharArray();
		for(int i=0;i<n3.length();i++) {
			System.out.println(a[i]);
		}
	}

}
