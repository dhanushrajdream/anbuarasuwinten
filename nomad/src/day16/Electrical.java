package day16;

public class Electrical implements NumberPlate {
	public void color() {
		System.out.println("Green");
	}
	public static void main(String[] args) {
		Electrical e=new Electrical();
		e.color();
	}

}
