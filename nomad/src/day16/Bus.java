package day16;

public class Bus implements Vehicle,Automobile {
	public int noOfWheels(int a) {
		return a;
	}
	public int speed(int b) {
		return b;
	}
	public void brake() {
		System.out.println("Brakes");
	}
	public void EngineCC() {
	System.out.println("130CC");
}
public static void main(String[] args) {
	Bus b=new Bus();
	System.out.println(b.noOfWheels(4));
	System.out.println(b.speed(250));
	b.brake();
	b.EngineCC();
}

}
