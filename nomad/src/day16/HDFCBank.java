package day16;

public class HDFCBank extends Bank1{
	public float getRateOfInterest(float a) {
		return a;
	}
	public static void main(String[] args) {
		HDFCBank h=new HDFCBank();
		h.controllerBank();
		System.out.println(h.getRateOfInterest(7.2f));
		}
	}


