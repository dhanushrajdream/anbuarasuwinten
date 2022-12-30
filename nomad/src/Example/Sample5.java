package Example;

public class Sample5 {
	public static void main(String[] args) {
		try {
			Integer.parseInt("45aaa");
		}
		catch(NullPointerException ne) {
			ne.printStackTrace();
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Checked");
	}

}
