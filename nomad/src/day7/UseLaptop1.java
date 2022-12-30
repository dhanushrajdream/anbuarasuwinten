package day7;

public class UseLaptop1 {
	public static void main(String[] args) {
		Laptop1 l1=new Laptop1();
		l1.brand="HP";
		l1.ram=8;
		Laptop1 l2=new Laptop1();
		l2.brand="ASUS";
		l2.ram=4;
		Laptop1 l3=new Laptop1();
		l3.brand="DELL";
		l3.ram=6;
		if (l1.ram>l2.ram && l1.ram>l3.ram) {
			System.out.println(l1.brand+" is highspeed");
		}
		else if (l2.ram>l1.ram && l2.ram>l3.ram) {
			System.out.println(l2.brand+" is highspeed");
		}
		else {
			System.out.println(l3.brand+" is highspeed");
		}
		
	}

}
