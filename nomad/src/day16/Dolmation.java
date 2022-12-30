package day16;

public class Dolmation extends Dogs {
	public String shape(String a) {
		return a;
	}
	public static void main(String[] args) {
		Dolmation d=new Dolmation();
		d.legs();
		System.out.println(d.shape("thin and polka dot all over the body"));
	}

}
