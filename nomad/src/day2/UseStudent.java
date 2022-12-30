package day2;

public class UseStudent {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.name="DORA";
		student1.id=22;
		student1.rollno=202203022l;
		student1.marks=450;
		student1.isPass=true;
		int pass=300;
		boolean isFail1=pass<student1.marks;
		System.out.println("NAME = "+student1.name+", ID = "+student1.id+", ROLLNO = "+student1.rollno+", MARKS = "+student1.marks+", ISPASS = "+student1.isPass);
		System.out.println("NAME = "+student1.name+", ID = "+student1.id+", ROLLNO = "+student1.rollno+", MARKS = "+student1.marks+", ISPASS = "+isFail1);
		Student student2=new Student();
		student2.name="RAM";
		student2.id=24;
		student2.rollno=202203024l;
		student2.marks=370;
		student2.isPass=true;
		boolean isFail2=pass<student2.marks;
		System.out.println("NAME = "+student2.name+", ID = "+student2.id+", ROLLNO = "+student2.rollno+", MARKS = "+student2.marks+", ISPASS = "+student2.isPass);
		System.out.println("NAME = "+student2.name+", ID = "+student2.id+", ROLLNO = "+student2.rollno+", MARKS = "+student2.marks+", ISPASS = "+isFail2);
		Student student3=new Student();
		student3.name="KRISH";
		student3.id=21;
		student3.rollno=202203021l;
		student3.marks=260;
		student3.isPass=false;
		boolean isFail3=pass<student3.marks;
		System.out.println("NAME = "+student3.name+", ID = "+student3.id+", ROLLNO = "+student3.rollno+", MARKS = "+student3.marks+", ISPASS = "+student3.isPass);
		System.out.println("NAME = "+student3.name+", ID = "+student3.id+", ROLLNO = "+student3.rollno+", MARKS = "+student3.marks+", ISPASS = "+isFail3);
		int total=student1.marks+student2.marks+student3.marks;
		float average=total/3f;
		System.out.println("TOTAL MARKS OF THREE STUDENTS IS "+total);
		System.out.println("AVERAGE MARKS OF THREE STUDENTS IS "+average);
		
	}

}
