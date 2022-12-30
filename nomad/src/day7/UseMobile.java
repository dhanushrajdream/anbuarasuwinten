package day7;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.brand="Samsung";
		m1.price=15000;
		m1.isWaterProof=false;
		Mobile m2=new Mobile();
		m2.brand="apple";
		m2.price=50000;
		m2.isWaterProof=true;
		if (m2.isWaterProof==true) {
			System.out.println(m2.brand+" is Waterproof");
		}
		else {
			System.out.println(m1.brand+" is  Waterproof");
		}
		}
	}


