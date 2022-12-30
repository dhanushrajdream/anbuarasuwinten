package day8;

public class Example16 {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int add=0;
		for(int i=11;i<=num;i++) {
			add=add+11;
		}
		int avg=add/num;
		System.out.println(add+" "+avg);
		
	}

}
