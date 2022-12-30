package day8;

public class Example13 {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int add=0;
		for(int i=0;i<=num;i++) {
			add=add+i;
		}
			
			int avg=add/num;
			System.out.println("Add=" +add+", Avg ="+avg);
	}

}
