package day16;

public class Bike implements Vehicle {
	public int noOfWheels(int a) {
		return a;
	}
	public int speed(int b) {
		return b;
	}
	public void brake() {
		System.out.println("Brakes");
	}


public static void main(String[] args) {
	Bike b=new Bike();
	System.out.println(b.noOfWheels(2));
	System.out.println(b.speed(150));
	b.brake();
}
	
}
