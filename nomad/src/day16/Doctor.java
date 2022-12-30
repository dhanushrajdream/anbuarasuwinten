package day16;

public class Doctor implements Human {
	public String work(String a) {
		return a;
	}
	public static void main(String[] args) {
		Doctor d=new Doctor();
		System.out.println(d.work("patient Work"));
	}

}
