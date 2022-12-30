package day11;

public class Ex15 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,-1,7};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				
				if(arr[i]==5) {
					continue;
				}
				
			System.out.println(arr[i]);
			}
			else if(arr[i]<0) {
				break;
			}
		}

	}
}

