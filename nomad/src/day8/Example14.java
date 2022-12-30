package day8;

public class Example14 {
	public static void main(String[] args) {
		int add=0;
		int num=Integer.parseInt(args[0]);
		for(int i=0;i<=num;i=i+2) {
			add=add+i;
		}
		int avg=add/num;
		System.out.println("Add="+add+", Avg="+avg);
	}

}
