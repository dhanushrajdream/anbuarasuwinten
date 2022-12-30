package day19;

public class Door {
	String brand;
	int price;
	String material;
	
	public Door(String brand,int price,String material) {
		this.brand=brand;
		this.price=price;
		this.material=material;
	}
	public String toString() {
		return "BRAND= "+brand+", PRICE= "+price+", MATERIAL= "+material;
	}

}
