package day16;

public class Apple implements SmartPhone,TouchId {
	public float OSVersion(float a) {
		return a;
	}
	public String Appstore(String b) {
		return b;
	}
	public int AppleId(int t) {
		return t;
	}
	public static void main(String[] args) {
		Apple ap=new Apple();
		System.out.println(ap.OSVersion(12.0f));
		System.out.println(ap.Appstore("Apple"));
		System.out.println(ap.AppleId(1234));
	}

}
