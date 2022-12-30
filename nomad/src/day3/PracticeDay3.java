package day3;

public class PracticeDay3 {
	public static void main(String[] args) {
		String word="Door is opened";
		System.out.println(word.toUpperCase());
		System.out.println(word.toLowerCase());
		System.out.println(word.length());
		System.out.println(word.concat(" then come"));
		System.out.println(word.startsWith("D"));
		System.out.println(word.endsWith("eed"));
		System.out.println(word.equals("Door is Opened"));
		System.out.println(word.equalsIgnoreCase("door is Opened"));
		System.out.println(word.contains("e"));
		System.out.println(word.indexOf("i"));
		System.out.println(word.charAt(8));
		System.out.println(word.substring(8,14));
		
		
	}

}
