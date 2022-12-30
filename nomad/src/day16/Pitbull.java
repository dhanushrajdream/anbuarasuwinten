package day16;

public class Pitbull extends Dogs{
	public String shape(String a) {
		return a;
	}
	public static void main(String[] args) {
		Pitbull p=new Pitbull();
		p.legs();
		System.out.println(p.shape("fit and gigantic"));
	}

}
