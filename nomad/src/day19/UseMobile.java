package day19;

import java.util.HashMap;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Oppo",15000,"Black");
		Mobile m2=new Mobile("Apple",50000,"Pink");
		Mobile m3=new Mobile("Vivo",20000,"White");
		HashMap<Integer,Mobile> mob=new HashMap<>();
		mob.put(1, m1);
		mob.put(2, m2);
		mob.put(3, m3);
		for(Mobile m:mob.values()) {
			System.out.println(m);
		}
		for(Mobile p:mob.values()) {
			if(p.brand.endsWith("o")) {
				System.out.println(p.brand);
			}
		}
	}

}
