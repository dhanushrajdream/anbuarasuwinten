package day13;

public class Ex8 {
	public String number(String a) {
		if(a.contains("a") || a.contains("e") || a.contains("i") || a.contains("o") || a.contains("u")) {
			return a+" is a vowel";
		}
		else {
			return a+" is not vowel";
		}
	}

}
