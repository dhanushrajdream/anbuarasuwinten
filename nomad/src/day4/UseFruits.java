package day4;

public class UseFruits {
	public static void main(String[] args) {
		String[]a=args[0].split(",");
		Fruits f1=new Fruits();
		f1.name=a[0].toUpperCase();
		f1.price=Integer.parseInt(a[1]);
		f1.colour=a[2].toLowerCase();
		f1.isTaste=Boolean.parseBoolean(a[3]);
		
		System.out.println("NAME= "+f1.name+", PRICE= "+f1.price+", COLOUR= "+f1.colour+", ISTASTE= "+f1.isTaste);
		
		String[]b=args[1].split("/");
		Fruits f2=new Fruits();
		f2.name=b[0].toUpperCase();
		f2.price=Integer.parseInt(b[1]);
		f2.colour=b[2].toLowerCase();
		f2.isTaste=Boolean.parseBoolean(b[3]);
		
		System.out.println("NAME= "+f2.name+", PRICE= "+f2.price+", COLOUR= "+f2.colour+", ISTASTE= "+f2.isTaste);
		
		System.out.println(f1.colour.charAt(f1.colour.length()-1));
		System.out.println(f1.name.contains("P"));
		System.out.println(f1.name.indexOf("E"));
		System.out.println(f2.name.substring(0,3));
		System.out.println(f1.name.concat(" phone"));
		System.out.println(f1.name.equalsIgnoreCase("apple"));
		System.out.println(f2.name.equals("GUAVA"));
	}

}
