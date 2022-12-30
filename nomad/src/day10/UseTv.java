package day10;

public class UseTv {
	public static void main(String[] args) {
		Tv t1=new Tv();
		String[] a=args[0].split(",");
		t1.brand=a[0];
		t1.model=a[1];
		t1.price=Integer.parseInt(a[2]);
		t1.size=Integer.parseInt(a[3]);
		Tv t2=new Tv();
		String[] b=args[1].split(",");
		t2.brand=b[0];
		t2.model=b[1];
		t2.price=Integer.parseInt(b[2]);
		t2.size=Integer.parseInt(b[3]);
		Tv t3=new Tv();
		String[] c=args[2].split(",");
		t3.brand=c[0];
		t3.model=c[1];
		t3.price=Integer.parseInt(c[2]);
		t3.size=Integer.parseInt(c[3]);
		Tv t[]= {t1,t2,t3};
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i].brand+" "+t[i].model+" "+t[i].price+" "+t[i].size);
		    System.out.println(t[i].brand);
		    System.out.println(t[i].model);
		    System.out.println(t[i].price);
		    System.out.println(t[i].size);
		}
	}

}