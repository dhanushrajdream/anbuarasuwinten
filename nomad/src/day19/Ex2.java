package day19;

import java.util.HashMap;

public class Ex2 {
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("jackie","julie");
		map.put("ben","gwen");
		map.put("goku","vegeta");
		map.put("jake","long");
		System.out.println(map);
	HashMap<Character,Integer> map1=new HashMap<>();
	map1.put('A',1);
	map1.put('B',2);
	map1.put('C',3);
	map1.put('D',4);
	System.out.println(map1);
	HashMap<Float,Double> map2=new HashMap<>();
	map2.put(1.55f,2.555d);
	map2.put(1.8467f,2.5487d);
	map2.put(1.45184f,4.516846d);
	System.out.println(map2);
	HashMap<Long,Boolean> map3=new HashMap<>();
	map3.put(1234567l,true);
	map3.put(124589235l,false);
	map3.put(1846461l,true);
	map3.put(645841456l,false);
	System.out.println(map3);
	
		
	}

}
