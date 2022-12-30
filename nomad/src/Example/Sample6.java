package Example;

public class Sample6 {
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
		finally {
			System.out.println("Check");
		}
	}
}

