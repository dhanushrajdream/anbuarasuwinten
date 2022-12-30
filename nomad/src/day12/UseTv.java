package day12;

public class UseTv {
	public static void main(String[] args) {
		Tv tv1=new Tv();
		String[] a=args[0].split(",");
		tv1.brand=a[0].toUpperCase();
		tv1.price=Integer.parseInt(a[1]);
		tv1.color=a[2];
		tv1.discount=Integer.parseInt(a[3]);
		tv1.net=tv1.price-tv1.discount;
		Tv tv2=new Tv();
		String[] b=args[1].split(",");
		tv2.brand=b[0].toUpperCase();
		tv2.price=Integer.parseInt(b[1]);
		tv2.color=b[2];
		tv2.discount=Integer.parseInt(b[3]);
		tv2.net=tv2.price-tv2.discount;
		Tv tv3=new Tv();
		String[] c=args[2].split(",");
		tv3.brand=c[0].toUpperCase();
		tv3.price=Integer.parseInt(c[1]);
		tv3.color=c[2];
		tv3.discount=Integer.parseInt(c[3]);
		tv3.net=tv3.price-tv3.discount;
		Tv tvs[]= {tv1,tv2,tv3};
		int max=0;
		int large=0;
		String largename="";
		for(int i=0;i<tvs.length;i++) {
			if(tvs[i].price>max) {
				max=tvs[i].price;
			}
		}
		System.out.println(max+" is the highest price");
		for(int i=0;i<tvs.length;i++) {
			if(tvs[i].brand.length()>large) {
				large=tvs[i].brand.length();
				largename=tvs[i].brand;
				
			}
		}
		System.out.println(largename+" is the largest name");
	}

}
