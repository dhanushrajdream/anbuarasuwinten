package day14;

public class UseCar1 {
	public static void main(String[] args) {
		Engine1 e=new Engine1();
		e.setBrand("borg");
		e.setPrice(100000);
		Car1 c=new Car1();
		c.setBrand("BMW");
		c.setPrice(1500000);
		c.setColour("Silver");
		c.setEngine(e);
		System.out.println("BRAND= "+c.getBrand()+", PRICE= "+c.getPrice()+", COLOUR= "+c.getColour()+", E.BRAND= "+e.getBrand()+", E.PRICE= "+e.getPrice());
	}

}
