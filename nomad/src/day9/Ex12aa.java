package day9;

public class Ex12aa {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
		String b="";
		for(int i=0;i<a.length;i++) {
			b=b.concat(a[i]);
			
		}
		System.out.println(b);
	}

}
