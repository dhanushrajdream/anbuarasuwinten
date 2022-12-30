package day14;

public class Car1 {
	private String brand;
	private int price;
	private String colour;
	private Engine1 engine;
	
	public void setBrand (String brand) {
		this.brand=brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setPrice (int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public void setColour (String colour) {
		this.colour=colour;
	}
	public String getColour() {
		return colour;
	}
	public void setEngine (Engine1 engine) {
		this.engine=engine;
	}
	public Engine1 getEngine() {
		return engine;
	}

}
