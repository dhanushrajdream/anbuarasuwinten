package day8;

public class Example15 {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int add=0;
		for(int i=1;i<=15;i=i+2) {
			add=add+i;
		}
		int avg=add/num;
		System.out.println("Add= "+add+" Avg="+avg);
	}

}
