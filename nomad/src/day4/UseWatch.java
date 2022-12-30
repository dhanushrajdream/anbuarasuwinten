package day4;

public class UseWatch {
	public static void main(String[] args) {
		String[] a=args[0].split(":");
		Watch watch1=new Watch();
		watch1.brand=a[0].toUpperCase();
		watch1.price=Integer.parseInt(a[1]);
		watch1.colour=a[2].toUpperCase();
		watch1.isWaterProof=Boolean.parseBoolean(a[3]);
		
		String[] b=args[1].split("/");
		Watch watch2=new Watch();
		watch2.brand=b[0].toUpperCase();
		watch2.price=Integer.parseInt(b[1]);
		watch2.colour=b[2].toUpperCase();
		watch2.isWaterProof=Boolean.parseBoolean(b[3]);
		
		String[] c=args[2].split("-");
		Watch watch3=new Watch();
		watch3.brand=c[0].toUpperCase();
		watch3.price=Integer.parseInt(c[1]);
		watch3.colour=c[2].toUpperCase();
		watch3.isWaterProof=Boolean.parseBoolean(c[3]);
		
		System.out.println("BRAND:"+watch1.brand+", PRICE:"+watch1.price+", COLOUR:"+watch1.colour+", ISWATERPROOF:"+watch1.isWaterProof);
		System.out.println("BRAND:"+watch2.brand+", PRICE:"+watch2.price+", COLOUR:"+watch1.colour+", ISWATERPROOF:"+watch2.isWaterProof);
		System.out.println("BRAND:"+watch3.brand+", PRICE:"+watch3.price+", COLOUR:"+watch3.colour+", ISWATERPROOF:"+watch3.isWaterProof);
		
		System.out.println(watch1.colour.length());
		System.out.println(watch2.colour.length());
		System.out.println(watch3.colour.length());
		
		
		
	}

}
