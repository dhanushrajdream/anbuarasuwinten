package day15;

public class Out {
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
			return "Rain";
		}
	}

}
