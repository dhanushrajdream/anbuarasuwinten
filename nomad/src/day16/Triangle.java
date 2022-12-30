package day16;

public class Triangle extends Shape {
	public void area() {
		int b=4;
		int h=5;
		System.out.println(b*h/2);
	}
	public static void main(String[] args) {
		Triangle t=new Triangle();
		t.color();
		t.area();
	}

}
