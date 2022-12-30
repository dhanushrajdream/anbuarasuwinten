package day19;

import java.util.HashMap;
import java.util.Iterator;

public class UseTv {
	
	public static void main(String[] args) {
		Tv t1=new Tv("Sony",38000,45);
		Tv t2=new Tv("Vu",42000,50);
		Tv t3=new Tv("Samsung",52000,52);
		HashMap<Integer,Tv> map=new HashMap<>();
		map.put(1, t1);
		map.put(2, t2);
		map.put(3, t3);
		Iterator<Integer> itr=map.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
		Iterator<Tv> itr1=map.values().iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
