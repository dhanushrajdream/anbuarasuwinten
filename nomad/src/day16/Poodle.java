package day16;

public class Poodle extends Dogs{
	public String shape(String a) {
		return a;
	}
	public static void main(String[] args) {
		Poodle po=new Poodle();
		po.legs();
		System.out.println(po.shape("hairy and cute"));
	}

}
