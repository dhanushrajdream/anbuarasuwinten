package day18;

import java.util.ArrayList;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung",6500,"Silver");
		Mobile m2=new Mobile("LG",8000,"Black");
		Mobile m3=new Mobile("Infinix",7500,"Black");
		ArrayList<Mobile> m=new ArrayList<>();
		m.add(m1);
		m.add(m2);
		m.add(m3);
		int discount=10;
		System.out.println(m);
		m.forEach(a->System.out.println(a));
		m.forEach(b->System.out.println("ADDING 10% OF DISCOUNT= "+(b.getPrice()+(b.getPrice()*discount/100))+" "+b.getBrand()+" "+b.getColor()));
		
		
	}

}
