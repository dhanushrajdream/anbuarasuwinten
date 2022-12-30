package day11;

public class Ex4 {
	public static void main(String[] args) {
		char letter[]= {'a','b','c','e','f','z','u'};
		for(int i=0;i<letter.length;i++) {
			if (letter[i]=='a' || letter[i]=='e' || letter[i]=='i' || letter[i]=='o' || letter[i]=='u') {
				System.out.println(letter[i]+" is vowel");
			}
			else {
				System.out.println(letter[i]+" is not vowel");
			}
	}
	}
}
