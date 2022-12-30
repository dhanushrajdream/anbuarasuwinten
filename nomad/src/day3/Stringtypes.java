package day3;

public class Stringtypes {
	public static void main(String[] args) {
		String day="MONday";
		String day1=day.toUpperCase();
		String day2=day.toLowerCase();
		int day3=day.length();
		String day4=day.concat(" is a day");
		boolean day5=day.startsWith("M");
		boolean day6=day.endsWith("y");
		boolean day7=day.equals("monday");
		System.out.println(day.toUpperCase());
		System.out.println(day.toLowerCase());
		System.out.println(day.length());
		System.out.println(day.concat(" is a worstday"));
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(day4);
		System.out.println(day.startsWith("M"));
		System.out.println(day.endsWith("y"));
		System.out.println(day5);
		System.out.println(day6);
		System.out.println(day.equals("monday"));
		System.out.println(day7);
		System.out.println(day.equalsIgnoreCase("MONday"));
		System.out.println(day.contains("d"));
		System.out.println(day.indexOf("a"));
		System.out.println(day.charAt(4));
		System.out.println(day.substring(0,3));

	
		
		}

}
