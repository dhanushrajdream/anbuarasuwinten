package day9;

public class Ex14a {
	public static void main(String[] args) {
		String a[]= args[0].split(",");
		float e=Float.parseFloat(a[0]);
		float b=Float.parseFloat(a[1]);
		float c=Float.parseFloat(a[2]);
		float d=Float.parseFloat(a[3]);
		float f[]= {e,b,c,d};
		float g=0;
		for(int i=0;i<a.length;i++) {
			g=g+f[i];
		}
			
			float avg=g/a.length;

		System.out.println(avg);
	}

}
