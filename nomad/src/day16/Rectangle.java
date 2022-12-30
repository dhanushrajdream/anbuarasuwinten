package day16;

public class Rectangle extends Shape {
	public void area () {
		int l=5;
		int b=4;
		System.out.println(l*b);
	}
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.color();
		r.area();
	}

}
