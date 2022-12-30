package day16;

public class Employee extends Person {
	
	private float salary;
	
	public void setSalary(float salary) {
		this.salary=salary;
	}
	public float getSalary() {
		return salary;
	}
	public Employee(String name, int age,float salary) {
		super(name, age);
		this.salary=salary;
	}
	public String toString() {
		return "Name: "+super.getName()+", Age: "+super.getAge()+", Salary: "+getSalary();
	}

}
