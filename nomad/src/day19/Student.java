package day19;

public class Student {
	String name;
	int yearOfPass;
	boolean isPass;
	String gender;
	
	public Student(String name,int yearOfPass,boolean isPass,String gender) {
		this.name=name;
		this.yearOfPass=yearOfPass;
		this.isPass=isPass;
		this.gender=gender;
	}
	public String toString() {
		return "NAME= "+name+", YEAROFPASS= "+yearOfPass+", ISPASS= "+isPass+", GENDER= "+gender;
	}

}
