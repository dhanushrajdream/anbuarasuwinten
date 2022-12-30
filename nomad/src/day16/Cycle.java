package day16;

public class Cycle implements Vehicle {

	public int noOfWheels(int a) {
		return a;
	}
	public int speed(int b) {
		return b;
	}
	public void brake() {
		System.out.println("Manual brake");
		
	}
	public static void main(String[] args) {
		Cycle c=new Cycle();
		System.out.println(c.noOfWheels(2));
		System.out.println(c.speed(20));
		c.brake();

}
}
