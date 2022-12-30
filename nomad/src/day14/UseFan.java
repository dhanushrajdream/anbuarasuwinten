package day14;

public class UseFan {
	public static void main(String[] args) {
		Coil c=new Coil("borg",500);
		Fan f=new Fan("orient",1600,"brown",c);
		Fan f1=new Fan("usha",2200,"black",c);
		Fan f2=new Fan("crompton",1800,"white",c);
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		if (f.getPrice()>f1.getPrice() && f.getPrice()>f2.getPrice()) {
			   System.out.println(f.getBrand()+" is highest price");
			}
			else if (f1.getPrice()>f.getPrice() && f1.getPrice()>f2.getPrice()) {
			 System.out.println(f1.getBrand()+" is the highest Price");
			}
			else { 
				System.out.println(f2.getBrand()+" is the highest price");
		}	
		}
	}

