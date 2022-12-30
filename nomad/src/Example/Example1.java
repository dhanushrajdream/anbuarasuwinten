package Example;

public class Example1 {
	public static void main(String[] args) {
		String a="ANBU";
		String name="";
		for(int i=a.length()-1;i>=0;i--) {
			name=name+a.charAt(i);
		}
			System.out.println(name);
			
			
			
		char[] b=a.toCharArray();
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(b[i]);
			
			
		}
		System.out.println();
		int c=20;
		int d=80;
		c=c-d;
		d=d+c;
		c=d-c;
		System.out.println(c+" "+d);
		
		
		}
}



