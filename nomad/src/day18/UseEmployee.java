package day18;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("Arun",20,false,20000);
		Employee e2=new Employee("Arul",23,false,16000);
		Employee e3=new Employee("Akash",28,true,25000);
		ArrayList<Employee> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		int max=0;
		int max1=0;
		String m="";
		String n="";
		System.out.println(l.size());
		System.out.println(l);
		for(int i=0;i<l.size();i++) {
			if(l.get(i).salary>max) {
				max=l.get(i).salary;
				m="NAME= "+l.get(i).name+", AGE= "+l.get(i).age+", MARRIED= "+l.get(i).isMarried+", SALARY= "+l.get(i).salary;
			}
		}
		System.out.println(max);
		System.out.println(m);
		
		for(Employee f:l) {
			if(f.salary>max1) {
				max1=f.salary;
				n=f.name+f.salary+f.isMarried;
				
			}
		}
			System.out.println(max1);
			System.out.println(n);
		
	l.forEach(a->System.out.println(a));
	l.forEach(b-> {
		if(b.isMarried==false) {
			System.out.println(b);
		}
	}
	);
		
	}
}


