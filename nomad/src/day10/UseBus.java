package day10;

public class UseBus {
	public static void main(String[] args) {
	Bus b1=new Bus();
	b1.name=args[0];
	b1.seats=Integer.parseInt(args[1]);
	b1.speed=Integer.parseInt(args[2]);
	Bus b2=new Bus();
	b2.name=args[3];
	b2.seats=Integer.parseInt(args[4]);
	b2.speed=Integer.parseInt(args[5]);
	Bus b3=new Bus();
	b3.name=args[6];
	b3.seats=Integer.parseInt(args[7]);
	b3.speed=Integer.parseInt(args[8]);
	Bus b4=new Bus();
	b4.name=args[9];
	b4.seats=Integer.parseInt(args[10]);
	b4.speed=Integer.parseInt(args[11]);
	Bus b5=new Bus();
	b5.name=args[12];
	b5.seats=Integer.parseInt(args[13]);
	b5.speed=Integer.parseInt(args[14]);
	Bus b6=new Bus();
	b6.name=args[15];
	b6.seats=Integer.parseInt(args[16]);
	b6.speed=Integer.parseInt(args[17]);
	Bus b7=new Bus();
	b7.name=args[18];
	b7.seats=Integer.parseInt(args[19]);
	b7.speed=Integer.parseInt(args[20]);
	Bus b8=new Bus();
	b8.name=args[21];
	b8.seats=Integer.parseInt(args[22]);
	b8.speed=Integer.parseInt(args[23]);
	Bus b9=new Bus();
	b9.name=args[24];
	b9.seats=Integer.parseInt(args[25]);
	b9.speed=Integer.parseInt(args[26]);
	Bus b10=new Bus();
	b10.name=args[27];
	b10.seats=Integer.parseInt(args[28]);
	b10.speed=Integer.parseInt(args[29]);
	Bus b[]= {b1,b2,b3,b4,b5,b6,b7,b8,b9,b10};
	String a=b1.name.concat(b2.name);
	String c=b3.name.concat(b4.name);
	String d=b5.name.concat(b6.name);
	String e=b7.name.concat(b8.name);
	String f=b9.name.concat(b10.name);
	String g=a.concat(c);
	String h=d.concat(e);
	String k=g.concat(h);
	String j=k.concat(f);
	int add=0;
	for( int i=0;i<b.length;i++) {
		add=add+b[i].seats;
	}
		System.out.println(add);
	
}
}
