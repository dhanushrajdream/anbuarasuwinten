package day7;

public class UseMovie {
	public static void main(String[] args) {
		Movie m=new Movie();
		m.rating=4;
		m.name="Venom";
		
		if (m.rating>=5) {
			System.out.println(m.name+" movie is Excellent");
		}
		else if (m.rating<5 && m.rating>=4) {
			System.out.println(m.name+" movie is Good");
		}
		else if (m.rating<4 && m.rating>3) {
			System.out.println(m.name+ " movie is Average");
		}
		else if (m.rating<=3 && m.rating>2) {
			System.out.println(m.name+" movie is Below average");
		}
		else {
			System.out.println(m.name+" movie is worst");
		}
	}

}
