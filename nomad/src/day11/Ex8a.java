package day11;

public class Ex8a {
	public static void main(String[] args) {
		String name="Manam";
		String name1="";
		char[] a=name.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			name1=name1+a[i];
		}
			if(name.equalsIgnoreCase(name1)) {	
				System.out.println("palindrome");
			}
			else {
				System.out.println("not palindrome");
		}
	}
}

