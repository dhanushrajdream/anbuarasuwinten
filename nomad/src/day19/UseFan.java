package day19;

import java.util.HashMap;

public class UseFan {
	public static void main(String[] args) {
		Fan f1=new Fan("usha",2500,"brown");
		Fan f2=new Fan("orient",1500,"black");
		Fan f3=new Fan("fly",1800,"white");
		HashMap<Integer,Fan> f=new HashMap<>();
		f.put(1,f1);
		f.put(2, f2);
		f.put(3, f3);
		f.forEach((a,b)-> {
			if(b.brand.contains("a") || b.brand.contains("e") || b.brand.contains("i") || b.brand.contains("o") || b.brand.contains("u")) {
				System.out.println(b.brand);
			}
		});
	}

}
