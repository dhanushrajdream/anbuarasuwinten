package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCricket {
	public static void main(String[] args) {
		Cricket c1=new Cricket("AAA",25,true,40,2);
		Cricket c2=new Cricket("BBB",26,true,45,3);
		Cricket c3=new Cricket("CCC",27,false,48,4);
		ArrayList<Cricket> a=new ArrayList<>();
		a.add(c1);
		a.add(c2);
		a.add(c3);
		List<Boolean> l=a.stream().map(x->x.age>10).collect(Collectors.toList());
		System.out.println(l);
		l.forEach(b->System.out.println(b));
		List<Cricket> m=a.stream().filter(y->y.age>22 && y.age<26).collect(Collectors.toList());
		m.forEach(c->System.out.println(c.name));
		List<Cricket> n=a.stream().filter(z->z.isBatsman==true).collect(Collectors.toList());
		n.forEach(d->System.out.println(d.name));
		for(Cricket e:n) {
			System.out.println(e.name);
		
		}
	}
}
