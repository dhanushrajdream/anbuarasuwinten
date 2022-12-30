package Time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class LocalT {
	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		Date date3=new Date();
		SimpleDateFormat ti=new SimpleDateFormat("hh:mm:ss:aa");
		String tim=ti.format(date3);
		System.out.println(tim);
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate date2=LocalDate.of(1994,12,15);
		System.out.println(date2);
		
		LocalDateTime current=LocalDateTime.now();
		System.out.println(current);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yy hh:mm:ss");
		String formattedDateTime=current.format(format);
		System.out.println(formattedDateTime);
		
		Month month=current.getMonth();
		int day=current.getDayOfMonth();
		int hour=current.getHour();
		System.out.println(month+" "+day+" "+hour);
		
		LocalDateTime specificDate=current.withDayOfMonth(15).withYear(1994);
		System.out.println(specificDate);
		
		Calendar now=Calendar.getInstance();
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
		now.add(Calendar.MINUTE,-20);
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+":"+now.get(Calendar.SECOND));
		
		System.out.println("IST Time is:"+new Date());
		OffsetDateTime d1;	
		d1=OffsetDateTime.now(ZoneOffset.UTC);
		System.out.println("UTC Time is:"+d1);
		
		LocalDate start_date= LocalDate.of(1994, 12, 15);
		LocalDate end_date=LocalDate.now();
		Period diff=Period.between(start_date, end_date);
		System.out.println(diff.getYears()+"years"+diff.getMonths()+"Months"+diff.getDays()+"Days");
		System.out.println((diff.getYears()*365)+(diff.getMonths()*30)+diff.getDays());
		
		LocalTime time1=LocalTime.of(8,30,00);
		LocalTime time2=LocalTime.of(21,15,00);
		long hours=ChronoUnit.HOURS.between(time1, time2);
		long minutes=ChronoUnit.MINUTES.between(time1, time2)%60;
		long seconds=ChronoUnit.SECONDS.between(time1, time2)%60;
		System.out.println(hours+" hours "+minutes+" minutes "+seconds+" seconds");
		
		Calendar c=	Calendar.getInstance();
		c.set(Calendar.DAY_OF_WEEK,Calendar.SUNDAY);
		System.out.println();
		DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(df.format(c.getTime()));
		for(int i=0;i<6;i++) {
			c.add(Calendar.DATE,6);	
		}
		System.out.println(df.format(c.getTime()));
		System.out.println();
		
		int months=18;
		int years=months/12;
		int remainingmonths=months%12;
		Period period=Period.ofMonths(months);
		int year=period.getYears();;
		int monthss=period.getMonths();
		System.out.println(year*365+monthss*30);
		
		
		
	}

}
