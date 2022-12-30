package Proj;

public class VariableArs {
	static void display(String...values) {
		System.out.println("Display not is");
		for(String s:values) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		display();
		display("hello");
		display("my","name","is");
	}

}
