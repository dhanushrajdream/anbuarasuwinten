package day19;

public class Ac {
	
	String brand;
	int price;
	int capacity;
	
	public Ac(String brand,int price,int capacity) {
		this.brand=brand;
		this.price=price;
		this.capacity=capacity;
	}
	public String toString() {
		return "BRAND= "+brand+", PRICE= "+price+", CAPACITY= "+capacity;
	}

}
