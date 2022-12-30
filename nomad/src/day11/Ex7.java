package day11;

public class Ex7 {
	public static void main(String[] args) {
		String name[]= {"java","python","C++","Angularjs","html","C"};
		int max=name[0].length();
		int min=name[0].length();
		String largename="";
		String smallname="";
		for (int i=0;i<name.length;i++) {
			if (name[i].length()>max) {
				max=name[i].length();
				largename=name[i];
			}
			else if(name[i].length()<min) {
				min=name[i].length();
				smallname=name[i];
			}
		}
		System.out.println(largename);
		System.out.println(smallname);
	}
}
