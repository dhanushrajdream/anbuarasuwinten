package day16;

public class AxisBank extends Bank1 {
	public float getRateOfInterest(float a) {
		return a;
	}
	public static void main(String[] args) {
		AxisBank ax=new AxisBank();
		ax.controllerBank();
		System.out.println(ax.getRateOfInterest(6.75f));
	}

}
