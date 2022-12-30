package day4;

public class UseBag {
	public static void main(String[] args) {
		String[] a=args[0].split(",");
	Bag bag1=new Bag();
	bag1.brand=a[0];
	bag1.price=Integer.parseInt(a[1]);
	bag1.colour=a[2];
	System.out.println("BRAND= "+bag1.brand+", PRICE= "+bag1.price+", COLOUR= "+bag1.colour);
	
	
	String[] b=args[1].split("@");
	Bag bag2=new Bag();
	bag2.brand=b[0];
	bag2.price=Integer.parseInt(b[1]);
	bag2.colour=b[2];
	System.out.println("BRAND= "+bag2.brand+", PRICE= "+bag2.price+", COLOUR= "+bag2.colour);
	
	String[]c=args[2].split("#");
	Bag bag3=new Bag();
	bag3.brand=c[0];
	bag3.price=Integer.parseInt(c[1]);
	bag3.colour=c[2];
	System.out.println("BRAND= "+bag3.brand+", PRICE= "+bag3.price+", COLOUR= "+bag3.colour);
	int total=(bag1.price+bag2.price+bag3.price);
	System.out.println("TOTAL OF THE THREE BAGS= "+total);
	
	
	
	
	}

}
