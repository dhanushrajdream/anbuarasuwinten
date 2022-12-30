package day12;

public class UseMobile {
	public static void main(String[] args) {
		Mobile mob1=new Mobile();
		mob1.brand="samsung".toUpperCase();
		mob1.price=10000;
		mob1.color="black";
		mob1.discount=500;
		mob1.net=mob1.price-mob1.discount;
		Mobile mob2=new Mobile();
		mob2.brand="mi".toUpperCase();
		mob2.price=10000;
		mob2.color="silver";
		mob2.discount=1000;
		mob2.net=mob2.price-mob2.discount;
		Mobile mob3=new Mobile();
		mob3.brand="sony".toUpperCase();
		mob3.price=7000;
		mob3.color="blue";
		mob3.discount=1500;
		mob3.net=mob3.price-mob3.discount;
		Mobile mobiles[]= {mob1,mob2,mob3};
		int min=mob1.net;
		String br="";
		String co="";
		for(int i=0;i<mobiles.length;i++) {
			if(mobiles[i].net<min) {
				min=mobiles[i].net;
				br=mobiles[i].brand;
				co=mobiles[i].color;
			}
		}
				System.out.println(br+" "+co+" "+min) ;
			}
		}
