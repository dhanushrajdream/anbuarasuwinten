package day16;

public class HDFC implements Bank {
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
		HDFC h=new HDFC();
		System.out.println(h.rateOfInterest(15));
		System.out.println(h.safety(false));
		System.out.println(h.minBal(4500));
	}

}
