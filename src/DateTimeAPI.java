import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
public class DateTimeAPI {

	public void testLocalDateTime(){
		
		LocalDateTime currentTime = LocalDateTime.now();
		System.out.println("suanki zaman"+currentTime);
		
		Month month = currentTime.getMonth();
		int day = currentTime.getDayOfMonth();
		int seconds= currentTime.getSecond();
		
		System.out.println("ay"+month+"gün"+day+"saat"+seconds);
		
		LocalDateTime timeExample = currentTime.withDayOfMonth(8).withYear(2016);
		System.out.println(timeExample);
		
	   LocalDate dateExample = LocalDate.of(2016, Month.AUGUST, 10);
		System.out.println(dateExample);
	
		LocalTime anotherTimeExample = LocalTime.of(20, 45);
		System.out.println(anotherTimeExample);
		
		LocalTime justAnotherExample = LocalTime.parse("19:20:15");
		System.out.println(justAnotherExample);

		
		

		
		
		
	}
	
	//2.kýsým
	
	public void testMethod(){
		Date currentDate = new Date();
		Instant now = currentDate.toInstant();
		ZoneId currentZone = ZoneId.systemDefault();
		LocalDateTime yerelZaman= LocalDateTime.ofInstant(now, currentZone);
		System.out.println(yerelZaman);
		ZonedDateTime bolgeselZaman = ZonedDateTime.ofInstant(now, currentZone);
		System.out.println(bolgeselZaman);
	}
	
}
