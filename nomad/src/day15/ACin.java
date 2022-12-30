package day15;

public class ACin extends Out {
	public String temp(int a) {
		if (a>40) {
			return "High";
		}
		else if(a>35 && a<40) {
			return "Normal";
		}
		else if(a>30 && a<35) {
			return "Low";
		}
		else {
			return "freeze";
		}
	}
	public static void main(String[] args) {
		ACin ac=new ACin();
		System.out.println(ac.temp(20));
		System.out.println(ac.temp(20));
	
	}
}
	


