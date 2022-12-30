package day19;

import java.util.HashMap;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1=new Laptop("DELL",43000,"SILVER");
		Laptop l2=new Laptop("HP",40000,"BLACK");
		Laptop l3=new Laptop("ASUS",22000,"BLUE");
		HashMap<Integer,Laptop> lap=new HashMap<>();
		lap.put(1, l1);
		lap.put(2, l2);
		lap.put(3, l3);
		int max=0;
		String maxb="";
		for(Laptop l:lap.values()) {
			System.out.println(l);
		}
		for(Laptop l:lap.values()) {
			if(l.price>max) {
				max=l.price;
				maxb=l.brand;
			}
		}
		System.out.println(max+" is Highest price");
		System.out.println(maxb+" brand is highest price");
	
	}

}
