package day16;

public class Square extends Shape {
	public void area() {
		int a=4;
		System.out.println(a*a);
	}
	public static void main(String[] args) {
		Square s=new Square();
		s.color();
		s.area();
	}

}
