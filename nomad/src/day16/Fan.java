package day16;

public class Fan implements SmartFan{
	public String brand(String valueOfBrand) {
		return valueOfBrand;
	}
	public int price(int valueOfPrice) {
		return valueOfPrice;
	}
	public int warranty(int valueOfWarranty) {
		return valueOfWarranty;
	}
	public String quality(int valueOfQuality) {
		if(valueOfQuality>2) {
			return "HIGH QUALITY";
		}
		else {
			return "LOW QUALITY";
		}
	}
	public boolean wifiAccess(boolean wifi) {
		return wifi;
	}
	public boolean isTorchFacility(boolean torch) {
		return torch;
	}
	public static void main(String[] args) {
		String valueOfBrand="crompton";
		int valueOfPrice=1250;
		int valueOfWarranty=3;
		int valueOfQuality=2;
		boolean wifi=true;
		Fan f=new Fan();
		System.out.println("brand: "+f.brand(valueOfBrand)+", Price: "+f.price(valueOfPrice)+", Warranty: "+f.warranty(valueOfWarranty)+", Quality"+f.quality(valueOfQuality)+", Wifi: "+f.wifiAccess(wifi));
	}

}
