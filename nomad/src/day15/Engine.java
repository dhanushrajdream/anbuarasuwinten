package day15;

public class Engine {
	private String brand;
	private int price;
	private String CC;
	
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setCC(String CC) {
		this.CC=CC;
	}
	public String getCC() {
		return CC;
	}
	public Engine(String brand,int price,String CC) {
		this.brand=brand;
		this.price=price;
		this.CC=CC;
	}
	public String toString() {
		return "Brand: "+brand+", Price: "+price+", CC: "+CC;
	}

}
