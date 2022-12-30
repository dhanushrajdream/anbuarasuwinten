package day3;

public class practice7Day3 {
	public static void main(String[] args) {
		String sentence="hello Welcome";
		String[]sent1=sentence.split(" ");
		char[]sent2=sentence.toCharArray();
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence.length());
		System.out.println(sentence.concat(" visitor"));
		System.out.println(sentence.startsWith("he"));
		System.out.println(sentence.endsWith("me"));
		System.out.println(sentence.equals("hello welcome"));
		System.out.println(sentence.equalsIgnoreCase("hello welcome"));
		System.out.println(sentence.contains("Wel"));
		System.out.println(sentence.indexOf("c"));
		System.out.println(sentence.charAt(10));
		System.out.println(sentence.substring(9,13));
		System.out.println(sent1[0]+" "+sent1[1]);
		System.out.println(sent2[0]+" "+sent2[1]+" "+sent2[2]+" "+sent2[3]+" "+sent2[4]+" "+sent2[5]+" "+sent2[6]+" "+sent2[7]+" "+sent2[8]+" "+sent2[9]+" "+sent2[10]+" "+sent2[11]+" "+sent2[12]);
	}

}
