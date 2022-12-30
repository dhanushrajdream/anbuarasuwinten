package day14;

public class Mobile {
	private String brand;
	private String color;
	private int price;
	private int discount;
	 int netPrice;
	private Battery battery;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setDiscount(int discount) {
		this.discount=discount;
	}
	public int getDiscount() {
		return discount;
	}
	public void setBattery(Battery battery) {
		this.battery=battery;
	}
	public Mobile(String brand,String color,int price,int discount,Battery battery) {
		this.brand=brand.toUpperCase();
		this.color=color.toUpperCase();
		this.price=price;
		this.discount=discount;
		this.battery=battery;
	}
	public String toString() {
		return "BRAND= "+brand+", COLOR= "+color+", PRICE= "+price+", NETPRICE= "+(price-discount)+", "+battery;
	}

}
