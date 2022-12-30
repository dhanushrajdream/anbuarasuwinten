package examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Ex1 {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Anbarasu");
		StringBuffer s2=s1.reverse();
		System.out.println(s2);
	String a="AnbarAsU";
	int count=0;
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(b[i]>='A' && b[i]<='Z') {
				count=count+1;
		}
	}
			System.out.println(count);
			for(int i=b.length-1;i>=0;i--) {
				System.out.print(b[i]);
			}
			int x=10;
			int y=20;
			int z;
		//	x=x-y;
		//	y=x+y;
		//  x=y-x;
			z=x;
			x=y;
			y=z;
			System.out.println(x+" "+y);
			Collection<String> collection = new ArrayList<>();
			collection.add("Geeks");
	        collection.add("For");
	        collection.add("Geeks");
	        collection.add("Internship");
	        collection.add("Internship");
	        collection.add("2021");
	        collection.add("2021");
	        System.out.println(collection);
	        HashSet<String> hashSet
            = new HashSet<>(collection);
	        System.out.println(hashSet);
	        SortedSet<Integer> abs_col
            = new TreeSet<Integer>();
	        abs_col.add(10);
	        abs_col.add(15);
	        abs_col.add(30);
	        abs_col.add(20);
	        abs_col.add(5);
	        abs_col.add(25);
	        abs_col.add(25);
	        System.out.println("The SortedSet: "
                    + abs_col);
	        abs_col.forEach(g->System.out.println(g));
	        
			
	}
		
	}



