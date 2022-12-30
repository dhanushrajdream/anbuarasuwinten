package day7;

public class Climate {
	public static void main(String[] args) {
		String name="Earth";
		int a=50;
		if (a>35) {
			System.out.println(name+" temperature is too hot");
		}
		else if (a<=35 && a>30) {
			System.out.println(name+" temperature is normal");
		}
		else if (a<=30 && a>25) {
			System.out.println(name+" temperature is low");
		}
		else {
			System.out.println(name+" doing rain");
		}
	}

}
