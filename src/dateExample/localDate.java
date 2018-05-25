package dateExample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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
	    
	    
	    
	}

}
