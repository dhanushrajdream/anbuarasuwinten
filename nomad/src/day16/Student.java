package day16;

public class Student implements Human {

	public String work(String a) {
		return a;
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.work("NoWork only homeWork"));
	}
	

}
