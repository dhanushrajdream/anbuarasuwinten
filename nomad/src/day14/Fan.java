package day14;

public class Fan {
	private String brand;
	private int price;
	private String color;
	private Coil coil;
	
	public void setBrand(String brand) {
		this. brand=brand;
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
	public void setColour(String color) {
		this.color=color;
	}
	public String getcolor() {
		return color;
	}
	public void setCoil (Coil coil) {
		this.coil=coil;
	}
	public Coil getCoil() {
		return coil;
	}
	public Fan(String brand,int price,String color,Coil coil) {
		this.brand=brand.toUpperCase();
		this.price=price;
		this.color=color;
		this.coil=coil;
	}
	public String toString() {
		return "BRAND= "+brand+", PRICE= "+price+", COLOR ="+color.toUpperCase()+", "+coil;
	}
}

