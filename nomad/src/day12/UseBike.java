package day12;

public class UseBike {
	public static void main(String[] args) {
		Bike bike1=new Bike();
		String[] a=args[0].split(" ");
		bike1.brand=a[0].toUpperCase();
		bike1.colour=a[1];
		bike1.price=Integer.parseInt(a[2]);
		bike1.regno=Integer.parseInt(a[3]);
		Bike bike2=new Bike();
		String[] b=args[1].split(" ");
		bike2.brand=b[0].toUpperCase();
		bike2.colour=b[1];
		bike2.price=Integer.parseInt(b[2]);
		bike2.regno=Integer.parseInt(b[3]);
		Bike bike3=new Bike();
		String[] c=args[2].split(" ");
		bike3.brand=c[0].toUpperCase();
		bike3.colour=c[1];
		bike3.price=Integer.parseInt(c[2]);
		bike3.regno=Integer.parseInt(c[3]);
		 Bike bikes[]=new Bike[3];
		 bikes[0]=bike1;
		 
	}

}
