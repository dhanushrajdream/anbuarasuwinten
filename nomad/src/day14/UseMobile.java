package day14;

public class UseMobile {
	public static void main(String[] args) {
		Battery b=new Battery("ino",700);
		Mobile m1=new Mobile("mi","black",13000,1000,b);
		Mobile m2=new Mobile("samsung","white",8000,500,b);
		Mobile m3=new Mobile("oppo","silver",10000,1500,b);
		Mobile mobiles[]= {m1,m2,m3};
		int min=mobiles[0].getPrice();
		String minb="";
		
		for(int i=0;i<mobiles.length;i++) {
			System.out.println(mobiles[i]);
		}
		for(int i=0;i<mobiles.length;i++) {
			if(mobiles[i].getPrice()<min) {
				min=mobiles[i].getPrice();
				minb="BRAND="+mobiles[i].getBrand()+", COLOR="+mobiles[i].getColor()+", PRICE= "+mobiles[i].getPrice();
			}
		}
		System.out.println(minb);
	}
}
