package day6;

public class Practice8 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		if (a<500 && a>=450) {
			System.out.println("S grade");
		}
		else if (a<450 && a>=400) {
			System.out.println("A grade");
		}
		else if (a<400 && a>=350) {
			System.out.println("B grade");
		}
		else if (a<350 && a>=300) {
			System.out.println("C grade");
		}
		else {
			System.out.println("Fail");
		}
	}

}
