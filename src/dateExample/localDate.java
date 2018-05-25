package dateExample;

import java.time.LocalDate;

public class localDate {

	public static void main(String[] args) {

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
	    
	
	}

}
