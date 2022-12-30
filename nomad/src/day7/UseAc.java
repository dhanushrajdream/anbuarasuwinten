package day7;

public class UseAc {
	public static void main(String[] args) {
		Ac ac=new Ac();
		ac.brand="BLUE STAR";
		ac.temp=24;
		if (ac.temp<=19) {
			System.out.println(ac.brand+" is consume high electricity");
		}
		else if (ac.temp>=20 && ac.temp<=23) {
			System.out.println(ac.brand+" is consume normal electricity");
		}
		else if (ac.temp>=24 && ac.temp<=30) {
			System.out.println(ac.brand+" is consume low electricity");
		}
		else {
			System.out.println(ac.brand+" is Off");
		}
	}

}
