package MethodsForStrings;

public class MetOfString {
	public static void main(String[] args) {
		String n = "Hello World";
		String [] x = n.split(" ");
		for(String word : x) {
			System.out.println(word);
			String a = String.valueOf(98676);
			System.out.println(a);
		}
		String s="Hello";
		char[] a=s.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		System.out.println();
		StringBuffer sb=new StringBuffer("Hello");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sb1=new StringBuilder("Hello World");
		sb1.reverse();
		System.out.println(sb1);
		
	}
}
