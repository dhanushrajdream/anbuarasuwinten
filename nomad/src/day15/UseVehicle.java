package day15;

public class UseVehicle {
	public static void main(String[] args) {
		Engine e=new Engine("borg",1200,"150cc");
		Bus b=new Bus("Aaa",12000,"Blue",e);
		System.out.println(b);
	}

}
