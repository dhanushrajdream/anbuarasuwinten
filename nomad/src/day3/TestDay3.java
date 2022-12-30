package day3;

public class TestDay3 {
	public static void main(String[] args) {
		String word="vormir";
		System.out.println(word.toUpperCase());
		System.out.println(word.length());
		String word1="titan";
		System.out.println(word1.toLowerCase());
		System.out.println(word1.length());
		String name="Onesoft Technology";
		System.out.println(name.contains("soft"));
		System.out.println(name.endsWith("y"));
		String name1="Avenger";
		System.out.println(name1.indexOf("A"));
		System.out.println(name1.charAt(4));
		String name2="Army";
		String name3="Girl";
		System.out.println(name2.equals("Army"));
		System.out.println(name3.equals("Girl"));
		String word2="wonder land";
		System.out.println(word2.equals("wonder land"));
		System.out.println(word2.equalsIgnoreCase("Wonder land"));
		String name4="Java,PYTHON,C++";
		String[]name5=name4.split(",");
		System.out.println(name5[0]+" "+name5[1]+" "+name5[2]);
		System.out.println(name5[0].length());
		System.out.println(name5[1].length());
		System.out.println(name5[2].length());
		System.out.println(name5[0].toLowerCase());
		System.out.println(name5[1].toLowerCase());
		System.out.println(name5[2].toLowerCase());
		String hero="HULK";
		char[] hero1=hero.toCharArray();
		System.out.println(hero1[0]);
		System.out.println(hero1[1]);
		System.out.println(hero1[2]);
		System.out.println(hero1[3]);
		String w="Fantacy program";
		System.out.println(w.startsWith("F"));
		System.out.println(w.endsWith("s"));
		System.out.println(w.length());
		System.out.println(w.charAt(13));
		
			
	}
}
