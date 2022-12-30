package day18;

import java.util.ArrayList;

public class UseBoard {
	public static void main(String[] args) {
		Board b1=new Board("aaa",400,"White");
		Board b2=new Board("bbb",500,"Black");
		Board b3=new Board("ccc",600,"White");
		ArrayList<Board> b=new ArrayList<>();
		b.add(b1);
		b.add(b2);
		b.add(b3);
		int count=0;
		System.out.println(b);
		for(Board c:b) {
			System.out.println(c);
		}
		for(Board a:b) {
			if(a.getColor().equals("White")) {
				count=count+1;
			}
		}
			System.out.println("No.of.WhiteBoard= "+count);
	}

}
