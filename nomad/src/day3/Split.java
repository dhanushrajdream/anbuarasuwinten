package day3;

public class Split {
	public static void main(String[] args) {
		String day="mon@tue@wed@thurs@fri";
		String[]days=day.split("@");
		System.out.println(days[0]+" "+days[1]+" "+days[2]+" "+days[3]+days[4]);
		System.out.println(days[0]);
		System.out.println(days[1]);
		String word="Welcome you";
		String[]word1=word.split(" ");
		System.out.println(word1[0]+word1[1]);
		
		
		
	}
}
