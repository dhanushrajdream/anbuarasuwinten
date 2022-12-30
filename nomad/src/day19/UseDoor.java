package day19;

import java.util.HashMap;

public class UseDoor {
	public static void main(String[] args) {
		Door d1=new Door("AAA",1500,"Steel");
		Door d2=new Door("BBB",1800,"Plastic");
		Door d3=new Door("CCC",2000,"Wood");
		HashMap<Integer,Door> d=new HashMap<>();
		d.put(1, d1);
		d.put(2, d2);
		d.put(3, d3);
		d.forEach((a,b)-> System.out.println(a+" "+b));
		d.forEach((a,b)-> {
			if(b.material.equals("Wood")) {
				System.out.println(b);
			}
		});
	}

}
