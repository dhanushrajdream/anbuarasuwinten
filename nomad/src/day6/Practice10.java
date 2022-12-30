package day6;

public class Practice10 {
	public static void main(String[] args) {
		String a=args[0];
		if (a.charAt(0)=='I') {
			System.out.println("INDIA");
		}
		else if (a.charAt(0)=='C') {
			System.out.println("CHINA");
		}
		else if (a.charAt(0)=='E') {
			System.out.println("EUROPE");
		}
		else {
			System.out.println(" NO DATA");
		}
	}

}
