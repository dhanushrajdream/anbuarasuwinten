package day19;

public class EarPhone {
	
	String brand;
	int price;
	boolean isWireless;
	
	public EarPhone(String brand,int price,boolean isWireless) {
		this.brand=brand;
		this.price=price;
		this.isWireless=isWireless;
	}
	public String toString() {
		return brand+price+isWireless;
	}

}
