package Time;

public class Once {
	
	public static void main(String[] args) {
		int [] a= {1,2,1,3};
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				System.out.println(a[i]+"");
			}
		}
		System.out.println(a[a.length-1]);
	}

}
