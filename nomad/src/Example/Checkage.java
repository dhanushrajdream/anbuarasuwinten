package Example;

public class Checkage {
	public static void main(String[] args) throws Sample7 {
		int age = 17;
		try {
			if (age <= 18) {
				throw new Sample7();
			} else {
				System.out.println("Eligible");
			}
		} catch(Sample7 e) {
			e.printStackTrace();
		}
		System.out.println("Check");
	}
}