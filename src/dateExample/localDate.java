package dateExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class localDate {

	public static void main(String[] args) {
		//

		LocalDate date = LocalDate.now();
	    LocalDate yesterday = date.minusDays(2);  
	    LocalDate tomorrow = yesterday.plusDays(3);  
	    System.out.println("Today date: "+date);  
	    System.out.println("Yesterday date: "+yesterday);  
	    System.out.println("Tommorow date: "+tomorrow);  
	    ////
	    LocalDate date1 = LocalDate.of(2018, 7, 8);  
	    System.out.println(date1.isLeapYear());  
	    LocalDate date2 = LocalDate.of(2017,4, 15);  
	    System.out.println(date2.isLeapYear());  
	    
	    ////
	    LocalDate date3 = LocalDate.of(2017, 1, 13);  
	    LocalDateTime datetime = date3.atTime(1,50,9);      
	    System.out.println(datetime);   
	///
	    
	    LocalTime time = LocalTime.now();  
	    System.out.println(date +"  "+time);
	    
	    ///
	    LocalTime time2 = LocalTime.of(10,43,12);  
	    System.out.println(date + " "+time2);  
	    //
	    LocalTime time3 = LocalTime.of(10,43,12);  
	    System.out.println(time3);  
	    LocalTime time4=time3.minusHours(2);  
	    LocalTime time5=time4.minusMinutes(34);  
	    System.out.println(time5);  
	    
	    ///
	    LocalTime time6 = LocalTime.of(10,43,12);  
	    
	    System.out.println(time6);  
	    LocalTime time7=time6.plusHours(4);  
	    LocalTime time8=time7.plusMinutes(18);  
	    System.out.println(time8);  
	    
	    //
	    ZoneId zone1 = ZoneId.of("Asia/Tehran");  
	    ZoneId zone2 = ZoneId.of("Europe/Rome");  
	    LocalTime time11 = LocalTime.now(zone1);  
	    System.out.println("Iran Time Zone: "+time11);  
	    LocalTime time12 = LocalTime.now(zone2);  
	    System.out.println("Italy Time Zone: "+time12);  
	    long hours = ChronoUnit.HOURS.between(time11, time12);  
	    System.out.println("Hours between two Time Zone: "+hours);  
	    long minutes = ChronoUnit.MINUTES.between(time11, time12);  
	    System.out.println("Minutes between two time zone: "+minutes);  
	    
	    //
	    LocalTime time25 = LocalTime.of(10,43,12);  
	    LocalTime time26 = LocalTime.of(14,53,8);  
	    long hours1 = ChronoUnit.HOURS.between(time25, time26);
	    System.out.println("Hours between two Time Zone: "+hours1); 
	    //
	    LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
        //
        LocalDateTime a = LocalDateTime.of(2018, 2, 13, 15, 56);    
        System.out.println(a.get(ChronoField.DAY_OF_WEEK));  
        System.out.println(a.get(ChronoField.DAY_OF_YEAR));  
        System.out.println(a.get(ChronoField.DAY_OF_MONTH));  
        System.out.println(a.get(ChronoField.HOUR_OF_DAY));  
        System.out.println(a.get(ChronoField.MINUTE_OF_DAY));   
	}
	

}
