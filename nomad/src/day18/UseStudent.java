package day18;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Arun","10th",'A');
		Student s2=new Student("Arul","11th",'B');
		Student s3=new Student("Goku","12th",'C');
		Student s4=new Student("Ben","8th",'A');
		Student s5=new Student("Gwen","9th",'B');
		ArrayList<Student> s=new ArrayList<>();
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		System.out.println(s);
		for (int i=0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getName().startsWith("A")) {
				System.out.println(s.get(i).getName());
			}
		}
		ArrayList<Student> listSec=new ArrayList<>();
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getSection()=='A') {
				listSec.add(s.get(i));
			}
		}
		System.out.println(listSec);
	}

}
