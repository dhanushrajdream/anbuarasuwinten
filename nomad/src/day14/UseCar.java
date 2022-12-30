package day14;

public class UseCar {
	public static void main(String[] args) {
		Engine e=new Engine();
		Car c=new Car();
		c.brand="BMW";
		c.price=1500000;
		c.color="silver";
		c.engine=e;
		e.brand="Borg";
		e.price=200000;
	
	System.out.println("BRAND= "+c.brand+", PRICE= "+c.price+", COLOR= "+c.color+", E.BRAND= "+e.brand+", E.PRICE= "+e.price);
	}

}
