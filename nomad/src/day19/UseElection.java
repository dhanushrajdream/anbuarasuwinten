package day19;

import java.util.HashMap;


public class UseElection {
	public static void main(String[] args) {
		Election e1=new Election("Ram",400);
		Election e2=new Election("Raj",500);
		Election e3=new Election("Ral",601);
		HashMap<Integer,Election> ele=new HashMap<>();
		ele.put(1, e1);
		ele.put(2, e2);
		ele.put(3, e3);
		int max=0;
		for(Election e:ele.values()) {
			if(e.votes>max) {
				max=e.votes;
			}
		}
		System.out.println(max+" is the highest vote");
		for(Election f:ele.values()) {
		System.out.println(f.name.charAt(f.name.length()-2));	
			}
		ele.forEach((a,b)-> System.out.println(b.name+b.votes));
		

	}
	}
	

	


