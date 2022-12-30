package day16;

public class Axis implements Bank {
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
	Axis ax=new Axis();
	System.out.println(ax.rateOfInterest(20));
	System.out.println(ax.safety(false));
	System.out.println(ax.minBal(4000));
}
	

}
