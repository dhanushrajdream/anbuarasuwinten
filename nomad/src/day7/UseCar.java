package day7;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car();
		c.brand="nano";
		c.price=200000;
		c.engineCC=2000;
		Car c1=new Car();
		c1.brand="suzuki";
		c1.price=300000;
		c1.engineCC=1500;
		Car c2=new Car();
		c2.brand="BMW";
		c2.price=400000;
		c2.engineCC=1000;
		if (c.price>c1.price && c.price>c2.price) {
			System.out.println(c.brand+" is the highest price");
		}
		else if (c1.price>c.price && c1.price>c2.price) {
			System.out.println(c1.brand+" is the highest price");
		}
		else {
			System.out.println(c2.brand+" is the highest price");
		}
	}

}
