package day2;

public class UsePractice {
	public static void main(String[] args) {
		Practice p1=new Practice();
		p1.name="siva";
		p1.id=234;
		p1.age=14;
		p1.std="IX";
		p1.attenper=75;
		int twd=240;
		p1.nodps=(twd*p1.attenper/100);
		System.out.println("NAME "+p1.name+" ID "+p1.id+"  AGE-"+p1.age+" STD-"+p1.std+" PER-"+p1.attenper+"%"+" NODPS-"+p1.nodps);
		Practice p2=new Practice();
		p2.name="mani";
		p2.id=236;
		p2.age=15;
		p2.std="X";
		p2.attenper=80;
		p2.nodps=(twd*p2.attenper/100);
		System.out.println("NAME "+p2.name+" ID "+p2.id+" AGE-"+p2.age+" STD-"+p2.std+" PER-"+p2.attenper+"%"+" NODPS-"+p2.nodps);
		Practice p3=new Practice();
		p3.name="valli";
		p3.id=237;
		p3.age=13;
		p3.std="VIII";
		p3.attenper=90;
		p3.nodps=(twd*p3.attenper/100);
		System.out.println("NAME "+p3.name+" ID "+p3.id+" AGE-"+p3.age+" STD-"+p3.std+" PER-"+p3.attenper+"%"+" NODPS-"+p3.nodps);
	
	}
	
}
