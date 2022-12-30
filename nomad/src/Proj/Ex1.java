package Proj;

import java.util.StringTokenizer;

public class Ex1 {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("My name is Anbu");
  while(st.hasMoreTokens()) {
		
		System.out.println(st.nextToken());
			
	}
}
}