package day12;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car();
		String[] a=args[0].split(" ");
		c1.brand=a[0].toUpperCase();
		c1.price=Integer.parseInt(a[1]);
		c1.color=a[2];
		c1.regno=Integer.parseInt(a[3]);
		Car c2=new Car();
		String[] b=args[1].split(" ");
		c2.brand=b[0].toUpperCase();
		c2.price=Integer.parseInt(b[1]);
		c2.color=b[2];
		c2.regno=Integer.parseInt(b[3]);
		Car c3=new Car();
		String[] c=args[2].split(" ");
		c3.brand=c[0].toUpperCase();
		c3.price=Integer.parseInt(c[1]);
		c3.color=c[2];
		c3.regno=Integer.parseInt(c[3]);
		Car c4=new Car();
		String[] d=args[3].split(" ");
		c4.brand=d[0].toUpperCase();
		c4.price=Integer.parseInt(d[1]);
		c4.color=d[2];
		c4.regno=Integer.parseInt(d[3]);
		Car c5=new Car();
		String[] e=args[4].split(" ");
		c5.brand=e[0].toUpperCase();
		c5.price=Integer.parseInt(e[1]);
		c5.color=e[2];
		c5.regno=Integer.parseInt(e[3]);
		Car car[]= {c1,c2,c3,c4,c5};
		for(int i=0;i<car.length;i++) {
			if(car[i].regno==c4.regno) {
				continue;
			}
				System.out.println("BRAND= "+car[i].brand+", PRICE= "+car[i].price+", COLOR= "+car[i].color+", REGNO="+car[i].regno);
			}
		}
	}

