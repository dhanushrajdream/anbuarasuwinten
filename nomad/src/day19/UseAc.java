package day19;

import java.util.HashMap;
import java.util.Iterator;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1=new Ac("BlueStar",25000,1);
		Ac ac2=new Ac("Whirlpool",30000,2);
		Ac ac3=new Ac("Onida",18000,1);
		HashMap<Integer,Ac> map=new HashMap<>();
		map.put(1, ac1);
		map.put(2, ac2);
		map.put(3, ac3);
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator<Ac> itr1=map.values().iterator();
		while(itr1.hasNext()) {
			Ac ac=(itr1.next());
			if(ac.brand.startsWith("W")) {
				System.out.println(ac);
			}
		}
	}

}
