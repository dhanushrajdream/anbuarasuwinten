package day8;

public class Exapmle21 {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int add=0;
		for(int i=0;i<=num;i++) {
		add=add+(i*i);
	}
		int avg=add/num;
	System.out.println(add+" "+avg);

}
}
