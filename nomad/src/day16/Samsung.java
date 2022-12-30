package day16;

public class Samsung implements SmartPhone {

	public float OSVersion(float a) {
		return a;
	}

	public String Appstore(String b) {
		return b;
	}
	public static void main(String[] args) {
		Samsung s=new Samsung();
		System.out.println(s.OSVersion(10.0f));
		System.out.println(s.Appstore("Google"));
	}

}
