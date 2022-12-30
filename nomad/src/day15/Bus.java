package day15;

public class Bus extends Vehicle {
	private Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	public Engine getEngine() {
		return engine;
	}
	public Bus(String brand, int price, String color,Engine engine) {
		super(brand, price, color);
		this.engine=engine;
	}
	public String toString() {
		return "BRAND: "+super.getBrand()+", Price: "+super.getPrice()+", COlor: "+super.getColor()+", "+engine;
	}
}
