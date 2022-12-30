package day7;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop();
		l1.brand="HP";
		l1.price=40000;
		l1.ram=8;
		Laptop l2=new Laptop();
		l2.brand="ASUS";
		l2.price=21000;
		l2.ram=4;
		Laptop l3=new Laptop();
		l3.brand="DELL";
		l3.price=43000;
		l3.ram=6;
		if (l1.price>l2.price && l1.price>l3.price) {
			System.out.println(l1.brand+" is the highest price");
		}
		else if (l2.price>l1.price && l2.price>l3.price) {
			System.out.println(l2.brand+" is the highest price");
		}
		else {
			System.out.println(l3.brand+" is the highest price");
		}
	}
}
	

