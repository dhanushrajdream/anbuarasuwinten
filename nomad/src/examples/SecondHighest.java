package examples;

import java.util.Arrays;

public class SecondHighest {
	public static void main(String[] args) {
		int a[]= {1,2,5,6,3,2};
		int total=a.length;
		Arrays.sort(a);
		System.out.println(a[total-2]);
	}

}
