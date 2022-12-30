package Example;

public class Sample2 {
	public static void main(String[] args) {
		
	
	try {
	        Integer.parseInt("Example");
		}
		catch (NumberFormatException f) {
			f.printStackTrace();
		}
		System.out.println("Checked Example");
		
	}

}
