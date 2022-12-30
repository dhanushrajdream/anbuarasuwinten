package day2;

public class UseMarker {
	public static void main(String[] args) {
		Marker m1=new Marker();
		m1.brand="Reynolds";
		m1.colour="blue";
		m1.price=30;
		m1.isWaterProof=true;
		System.out.println(m1.brand+" "+m1.colour+" "+m1.price+" "+m1.isWaterProof);
		Marker m2=new Marker();
		m2.brand="Rorito";
		m2.colour="black";
		m2.price=40;
		m2.isWaterProof=true;
		System.out.println(m2.brand+" "+m2.colour+" "+m2.price+" "+m2.isWaterProof);
		Marker m3=new Marker();
		m3.brand="Doms";
		m3.colour="green";
		m3.price=15;
		m3.isWaterProof=false;
		System.out.println(m3.brand+" "+m3.colour+" "+m3.price+" "+m3.isWaterProof);
	}

}
