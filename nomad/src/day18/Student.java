package day18;

public class Student {
	private String name;
	private String std;
	private char section;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setStd(String std) {
		this.std=std;
	}
	public String getStd() {
		return std;
	}
	public void setSection(char section) {
		this.section=section;
	}
	public char getSection() {
		return section;
	}
	public Student(String name,String std,char section) {
		this.name=name;
		this.std=std;
		this.section=section;
	}
	public String toString() {
		return "NAME= "+name+", STD= "+std+", SECTION= "+section;
	}

}
