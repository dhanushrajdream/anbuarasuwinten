package day10;

public class UseFridge {
	public static void main(String[] args) {
		Fridge f1=new Fridge();
		f1.brand=args[0];
		f1.price=Integer.parseInt(args[1]);
		f1.height=Integer.parseInt(args[2]);
		Fridge f2=new Fridge();
		f2.brand=args[3];
		f2.price=Integer.parseInt(args[4]);
		f2.height=Integer.parseInt(args[5]);
		Fridge f3=new Fridge();
		f3.brand=args[6];
		f3.price=Integer.parseInt(args[7]);
		f3.height=Integer.parseInt(args[8]);
		Fridge f[]= {f1,f2,f3};
		for(int i=0;i<f.length;i++) {
			System.out.println(f[i].brand+" "+f[i].price+" "+f[i].height);
		}
					
	}

}
