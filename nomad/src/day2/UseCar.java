package day2;

public class UseCar {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.brand="AUDI";
		car1.colour="BLACK";
		car1.price=300000;
		System.out.println("BRAND = "+car1.brand+", COLOUR = "+car1.colour+", PRICE = "+car1.price);
		Car car2=new Car();
		car2.brand="TOYOTO";
		car2.colour="RED";
		car2.price=100000;
		System.out.println("BRAND = "+car2.brand+", COLOUR = "+car2.colour+", PRICE = "+car2.price);
		Car car3=new Car();
		car3.brand="BMW";
		car3.colour="BLUE";
		car3.price=200000;
		System.out.println("BRAND = "+car3.brand+", COLOUR = "+car3.colour+", PRICE = "+car3.price);
		int total=car1.price+car2.price+car3.price;
		System.out.println("TOTAL PRICE OF CAR IS "+total);
		int diff=car1.price-car3.price;
		System.out.println("DIFFERENCE OF AUDI AND BMW IS "+diff);
				
		
	}

}
