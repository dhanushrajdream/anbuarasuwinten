package Time;

import java.text.DateFormatSymbols;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Zone {
	public static void main(String[] args) {
		ZonedDateTime currentZone=ZonedDateTime.now();
		System.out.println(currentZone);
		
		
		Calendar ca=Calendar.getInstance();
		int lastDate=ca.getActualMaximum(Calendar.DATE);
		ca.set(Calendar.DATE,lastDate);
		int lastDay=ca.get(Calendar.DAY_OF_WEEK);
		System.out.println(ca.getTime());
		System.out.println(lastDay);
		DateFormatSymbols dfs=new DateFormatSymbols();
		System.out.println(dfs.getWeekdays()[lastDay]);
		
		
		
			
	}

}
