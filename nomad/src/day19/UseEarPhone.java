package day19;

import java.util.HashMap;
import java.util.Iterator;

public class UseEarPhone {
	public static void main(String[] args) {
		EarPhone e1=new EarPhone("Sony",1800,true);
		EarPhone e2=new EarPhone("Samsung",1200,false);
		EarPhone e3=new EarPhone("Zebronics",1100,true);
		HashMap<Integer,EarPhone> ear=new HashMap<>();
		ear.put(1, e1);
		ear.put(2, e2);
		ear.put(3, e3);
		Iterator<EarPhone> earp=ear.values().iterator();
		while(earp.hasNext()) {
			EarPhone e=(EarPhone)(earp.next());
			if(e.isWireless==true) {
				System.out.println("BRAND= "+e.brand+",PRICE WITH 12% DISCOUNT= "+(e.price+(e.price*12/100)));
			}
		}
	}

}
