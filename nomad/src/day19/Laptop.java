package day19;

public class Laptop {
	String brand;
	int price;
	String color;
	
	public Laptop(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String toString() {
		return "BRAND= "+brand+", PRICE= "+price+", COLOR= "+color;
		
	}

}
