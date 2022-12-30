package Proj;

public class VariableArgs {
	static void disply(String...Values) {
		System.out.println("Display not");
	}
	public static void main(String[] args) {
		disply();
		disply("Display");
	}
}


