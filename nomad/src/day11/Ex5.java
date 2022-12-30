package day11;

public class Ex5 {
	public static void main(String[] args) {
		char letter[]= {'a','b','c','e','f','z','u'};
		int vowel=0;
		int notvowel=0;
		for(int i=0;i<letter.length;i++) {
			if (letter[i]=='a' || letter[i]=='e' || letter[i]=='i' || letter[i]=='o' || letter[i]=='u') {
				vowel=vowel+1;
			}
			else {
				notvowel=notvowel+1;	
			}
		}
			System.out.println("total vowel="+vowel);
			System.out.println("total not vowel="+notvowel);
	}

}
