package day11;

public class Max {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6};
		int max=0;
		int mul=1;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
		}
		}
		for(int i=1;i<=max;i++) {
			mul=mul*i;
		}
				System.out.println("Factorial of highest number="+mul);
			}
		}



