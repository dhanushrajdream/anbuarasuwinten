package day16;

public class Iob implements Bank {
	public int rateOfInterest(int a) {
		return a;
	}
	public boolean safety(boolean b) {
		return b;	
	}
	public int minBal(int c) { 
		return c;
	}
	public static void main(String[] args) {
		Iob i=new Iob();
		System.out.println(i.rateOfInterest(10));
		System.out.println(i.safety(true));
		System.out.println(i.minBal(4000));
	}

}
