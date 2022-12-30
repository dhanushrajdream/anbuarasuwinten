package day12;

public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		String[] a=args[0].split(" ");
		s1.name=a[0].toUpperCase();
		s1.rollno=Integer.parseInt(a[1]);
		s1.total=Integer.parseInt(a[2]);
		s1.avg=s1.total/6;
		Student s2=new Student();
		String[] b=args[1].split(" ");
		s2.name=b[0].toUpperCase();
		s2.rollno=Integer.parseInt(b[1]);
		s2.total=Integer.parseInt(b[2]);
		s2.avg=s2.total/6;
		Student s3=new Student();
		String[] c=args[2].split(" ");
		s3.name=c[0].toUpperCase();
		s3.rollno=Integer.parseInt(c[1]);
		s3.total=Integer.parseInt(c[2]);
		s3.avg=s3.total/6;
		Student studs[]= {s1,s2,s3};
	System.out.println("PASS STUDENT LIST:");
		for(int i=0;i<studs.length;i++) {
			if(studs[i].total>250) {
				System.out.println("NAME= "+studs[i].name+", ROLLNO= "+studs[i].rollno+", TOTAL="+studs[i].total+", AVERAGE= "+studs[i].avg);
			}
		}
		System.out.println("FAIL STUDENT LIST:");
		for(int i=0;i<studs.length;i++) {
			 if(studs[i].total<250) {
				System.out.println("NAME= "+studs[i].name+", ROLLNO= "+studs[i].rollno+", TOTAL="+studs[i].total+", AVERAGE= "+studs[i].avg);
			}
		}
	}
}

			