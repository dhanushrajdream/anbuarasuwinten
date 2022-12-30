package day11;

public class Ex6 {
	public static void main(String[] args) {
		int num[]= {10,-5,6,7,11,57,-14,-16};
		int max=0;
		int min=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
			else if(num[i]<min) {
				min=num[i];
			}
		}
				System.out.println(max+" is the highest value");
				System.out.println(min+" is the lowest value");
			}
		}

