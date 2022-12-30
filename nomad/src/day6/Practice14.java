package day6;

public class Practice14 {
	public static void main(String[] args) {
		int a=1;
		if (a<60 && a>=35 ) {
			System.out.println("ELDER");
		}
		else if (a<35 && a>=18) {
			System.out.println("ADULT");
		}
		else if (a<18 && a>0) {
			System.out.println("CHILD");
		}
		else {
			System.out.println("SENIOR CITIZEN");
		}
	}

}
