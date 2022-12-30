package day11;

public class Ex6a {
	public static void main(String[] args) {
		int arr[]= {10,50,60,30,20,1,70};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}