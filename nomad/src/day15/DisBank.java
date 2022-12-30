package day15;

public class DisBank extends StateBank {
	public int loan(int a,int b) {
		return a-b;
	}
	public static void main(String[] args) {
		DisBank d=new DisBank() ;
		System.out.println(d.loan(5000,1000));
		System.out.println(d.loan(5000,1000));
	}

}
