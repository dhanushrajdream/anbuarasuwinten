package day19;

import java.util.HashMap;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student("Madhu",2016,true,"Female");
		Student s2=new Student("Vicky",2017,false,"Male");
		Student s3=new Student("Jeeva",2016,false,"Male");
		HashMap<Integer,Student> map=new HashMap<>();
		map.put(1, s1);
		map.put(2, s2);
		map.put(3, s3);
		for(Integer i:map.keySet()) {
			System.out.println(i);
		}
		for(Student s:map.values()) {
			System.out.println(s);
		}
		for(Student t:map.values()) {
			if(t.gender.equals("Male")) {
				System.out.println(t.name);
			}
		}
		map.forEach((x,y)-> System.out.println(x+" "+y));
		map.forEach((a,b)-> {
			if(b.isPass==true) {
				System.out.println(b);
			}
		});
	}

}
