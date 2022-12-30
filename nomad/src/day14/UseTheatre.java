package day14;

public class UseTheatre {
	public static void main(String[] args) {
		Movie m=new Movie("AVENGERS",8,true);
		Theatre t1=new Theatre("gk",50,m);
		Theatre t2=new Theatre("sundar",60,m);
		Theatre t3=new Theatre("sb",80,m);
		Theatre the[]= {t1,t2,t3};
		for(int i=0;i<the.length;i++) {
			System.out.println(the[i]);
		}
		
	}

}
