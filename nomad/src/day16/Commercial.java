package day16;

public class Commercial implements NumberPlate {
	public void color() {
		System.out.println("Yellow");
	}
	public static void main(String[] args) {
		Commercial c=new Commercial();
		c.color();
	}

}
