package day18;

public class Employee {
	String name;
	int age;
	boolean isMarried;
	int salary;
	
	public Employee(String name,int age,boolean isMarried,int salary) {
		this.name=name;
		this.age=age;
		this.isMarried=isMarried;
		this.salary=salary;
	}
	public String toString() {
		return "NAME= "+name+", AGE= "+age+", MARRIED= "+isMarried+", SALARY= "+salary;
	}

}
