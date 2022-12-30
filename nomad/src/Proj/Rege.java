package Proj;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rege {
	public static void main(String[] args) {
		Pattern p= Pattern.compile("\\D\\D\\D\\D");//digits do not apply
		Matcher m=p.matcher("Anbu");
		boolean b=m.matches();
		System.out.println(b);
		Pattern p1= Pattern.compile("\\d\\d\\d\\d");//only digit apply
		Matcher m1=p1.matcher("1234");
		boolean b1=m1.matches();
		System.out.println(b1);
		Pattern p2= Pattern.compile("\\s\\s\\s\\s");//only space apply
		Matcher m2=p2.matcher("    ");
		boolean b2=m2.matches();
		System.out.println(b2);
		Pattern p3= Pattern.compile("\\S\\S\\S\\S");//space do not apply
		Matcher m3=p3.matcher("Anbu");
		boolean b3=m3.matches();
		System.out.println(b3);
		Pattern p4= Pattern.compile("\\W\\W\\W\\W");//word do not apply
		Matcher m4=p4.matcher("$$$$");
		boolean b4=m4.matches();
		System.out.println(b4);
		//only word apply
		boolean b5=Pattern.matches("\\w\\w\\w\\w","Anbu");
		System.out.println(b5);
		//space,word,digit,special char apply
		boolean b6= Pattern.compile("....").matcher(" $3A").matches();
		System.out.println(b6);
		
		System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9953038949"));//true  
		System.out.println(Pattern.matches("[789][0-9]{9}", "9953038949"));//true  
		  
		System.out.println(Pattern.matches("[789][0-9]{9}", "99530389490"));//false (11 characters)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "6953038949"));//false (starts from 6)  
		System.out.println(Pattern.matches("[789][0-9]{9}", "8853038949"));//true  
		  
		System.out.println("by metacharacters ...");  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8853038949"));//true  
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "3853038949"));//false (starts from 3) 


	}

}
