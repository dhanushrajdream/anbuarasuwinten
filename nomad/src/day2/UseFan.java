package day2;

public class UseFan {
	public static void main(String[] args) {
		Fan fan1=new Fan();
		fan1.brand="USHA";
		fan1.colour="RED";
		fan1.price=2200;
		fan1.discount=200;
		fan1.noOfWings=3;
		fan1.isThreeWings=(fan1.noOfWings==3);
		fan1.netPrice=(fan1.price-fan1.discount);
		System.out.println("BRAND = "+fan1.brand+" COLOUR = "+fan1.colour+" PRICE = "+fan1.price+" NO OF WINGS = "+fan1.noOfWings+" IS THREE WINGS = "+fan1.isThreeWings+" NET PRICE = "+fan1.netPrice);
		Fan fan2=new Fan();
		fan2.brand="ORIENT";
		fan2.colour="BLUE";
		fan2.price=5500;
		fan2.discount=250;
		fan2.noOfWings=4;
		fan2.isThreeWings=(fan2.noOfWings==3);
		fan2.netPrice=(fan2.price-fan2.discount);
		System.out.println("BRAND = "+fan2.brand+" COLOUR = "+fan2.colour+" PRICE = "+fan2.price+" NO OD WINGS = "+fan2.noOfWings+" IS THREE WINGS = "+fan2.isThreeWings+" NET PRICE = "+fan2.netPrice);
		Fan fan3=new Fan();
		fan3.brand="BAJAJ";
		fan3.colour="WHITE";
		fan3.price=4500;
		fan3.discount=250;
		fan3.noOfWings=3;
		fan3.isThreeWings=(fan3.noOfWings==3);
		fan3.netPrice=(fan3.price-fan3.discount);
		System.out.println("BRAND = "+fan3.brand+" COLOUR = "+fan3.colour+" PRICE = "+fan3.price+" NO OF WINGS = "+fan3.noOfWings+" IS THREE WINGS = "+fan3.isThreeWings+" NET PRICE = "+fan3.netPrice);
		int total=fan1.price+fan2.price+fan3.price;
		int totalNet=fan1.netPrice+fan2.netPrice+fan3.netPrice;
		int duo=fan2.price-fan1.price;
		int dob=fan2.price-fan3.price;
		int dub=fan3.price-fan1.price;
		System.out.println("TOTAL PRICE OF FANS ARE "+total);
		System.out.println("TOTAL NETPRICE OF FANS ARE "+totalNet);
		System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN USHA AND ORIENT IS "+duo);
		System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN ORIENT AND BAJAJ IS "+dob);
		System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN USHA AND BAJAJ IS "+dub);
		System.out.println("THE DIFFERENCE OF AMOUNT BETWEEN "+fan3.brand+" AND "+fan1.brand+" IS "+dub);
			
	}
	
}
