package day15;

public class UseTelevision {
	public static void main(String[] args) {
		String brand=args[0];
		int price=Integer.parseInt(args[1]);
		int deliveryCharge=Integer.parseInt(args[2]);
		String access=args[3];
		String cool=args[4];
		Television t=new Television();
System.out.println("BRAND= "+t.brand(brand)+", PRICE= "+t.price(price)+", NETPRICE METHOD= "+t.getnetPrice(price,deliveryCharge)+", WIFI= "+t.wifiAccess(access)+" AUTOCOOLING= "+t.autoCooling(cool));
		
		
	}

}
abstract class SmartTelevision {
	public String autoCooling(String cool) {
		return cool;
	}
	public String wifiAccess(String access) {
		return access;
	}
}
class Television extends SmartTelevision {
	public String brand(String brand) {
		return brand;
	}
	public int price(int price) {
		return price;
	}
	public String getnetPrice(int price,int deliveryCharge) {
		int netPrice=price+deliveryCharge;
		if(netPrice>50000) {
			return "Heavy";
		}
		else {
			return "Below 50000";
		}
	}
}
