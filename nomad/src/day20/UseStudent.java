package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Rajan",12,350,"Male");
		Student s2=new Student("Rani",13,380,"Female");
		Student s3=new Student("Govind",14,400,"Male");
		Student s4=new Student("Sophie",15,418,"Female");
		ArrayList<Student> a=new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		long l=a.stream().count();
		System.out.println("Count the Object "+l);
		List<String>n=a.stream().filter(x->x.age>13).map(y->y.name).collect(Collectors.toList());
		n.forEach(s->System.out.println(s));
		List<String>f=a.stream().filter(i->i.name.endsWith("d")).map(z->"NAME "+z.name+", AGE +"+z.age+", MARKS "+z.marks+", GENDER "+z.gender).collect(Collectors.toList());
		f.forEach(t->System.out.println(t));
		Long d=a.stream().filter(j->j.age>13).count();
		System.out.println("Count of 13 age above "+d);
	}

}
