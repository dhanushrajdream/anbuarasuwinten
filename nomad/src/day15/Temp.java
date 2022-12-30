package day15;

public class Temp {
	public String tem(int a) {
	if(a>40) {
		return "HIGH TEMP";
	}
	else if(a>35 && a<40) {
		return "MEDIUM TEMP";	
	}
	else if(a>30 && a<35) {
		return "LOW TEMP";
	}
	else {
		return "RAIN";
	}
	}
	public String tem(float a) {
		if(a>40) {
			return "HIGH TEMP";
		}
		else if(a>35 && a<35) {
			return "MEDIUM TEMP";	
		}
		else if(a>30 && a<35) {
			return "LOW TEMP";
		}
		else {
			return "RAIN";
		}
	}
	public static void main(String[] args) {
		Temp t=new Temp();
		System.out.println(t.tem(25));
		System.out.println(t.tem(32.3f));
	}

}
