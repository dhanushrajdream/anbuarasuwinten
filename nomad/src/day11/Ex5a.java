package day11;

public class Ex5a {
	public static void main(String[] args) {
		int odd=0;
		int even=0;
		for(int i=1;i<=10;i++) {
			if (i%2==0) {
				even=even+1;
			}
			else if (i%2!=0) {
				odd=odd+1;	
			}
		}
			System.out.println("total even="+even);
			System.out.println("total not odd="+odd);
	}

}


