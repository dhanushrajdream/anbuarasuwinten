package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCollege {
	public static void main(String[] args) {
		College c1=new College("Raj",18,40000);
		College c2=new College("Rani",19,45000);
		College c3=new College("Seran",20,50000);
		ArrayList<College> c=new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		List<String>l=c.stream().filter(x->x.age>=18 && x.name.startsWith("R") && x.name.endsWith("i")).map(z->z.name.toUpperCase()).collect(Collectors.toList());
		System.out.println(l);
		l.forEach(a-> System.out.println(a));
		long m=c.stream().filter(t->t.name.startsWith("R")).map(s->s.name.toUpperCase()).count();
		System.out.println(m);
		long h=c.stream().count();
		System.out.println(h);
		List<String>g=c.stream().map(i->i.name).collect(Collectors.toList());
		System.out.println(g);
		g.forEach(u->System.out.println(u));
	}

}
