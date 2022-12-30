package day7;

public class UseFan {
	public static void main(String[] args) {
		Fan f=new Fan();
		f.brand="Usha";
		f.speed=5;
		if (f.speed>=5) {
			System.out.println(f.brand+" is high speed");
		}
		else if (f.speed<5 && f.speed>3) {
			System.out.println(f.brand+" is minimum speed");
		}
		else if (f.speed<3 && f.speed>1) {
			System.out.println(f.brand+ " is low speed");
		}
		else {
			System.out.println("Switch Off");
		}
	}

}
