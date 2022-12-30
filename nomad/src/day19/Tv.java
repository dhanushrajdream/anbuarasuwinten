package day19;

public class Tv {
	String brand;
	int price;
	int inch;
	
	public Tv(String brand,int price,int inch) {
		this.brand=brand;
		this.price=price;
		this.inch=inch;
	}
	public String toString() {
		return "BRAND= "+brand+", PRICE= "+price+", INCH= "+inch;
	}

}
