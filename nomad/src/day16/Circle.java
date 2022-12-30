package day16;

public class Circle extends Shape {
	public void area() {
		int r=4;
		System.out.println(3.14*r*r);
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.color();
		c.area();
	}

}
