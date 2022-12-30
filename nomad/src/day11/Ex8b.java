package day11;

public class Ex8b {
	public static void main(String[] args) {
		String name="madam";
		String pal="";
		for(int i=name.length()-1;i>=0;i--) {
			pal=pal+name.charAt(i);
		}
		if(pal.equalsIgnoreCase(name)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

}
