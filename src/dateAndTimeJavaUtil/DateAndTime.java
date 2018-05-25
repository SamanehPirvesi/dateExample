package dateAndTimeJavaUtil;

import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) {
		//long millis=System.currentTimeMillis();
		Date date=new Date();  
		System.out.println(date);
		//
		Calendar calendar = Calendar.getInstance();  
		   System.out.println("The current date is : " + calendar.getTime());  
		   calendar.add(Calendar.DATE, -15);  
		   System.out.println("15 days ago: " + calendar.getTime());  
		   calendar.add(Calendar.MONTH, 4);  
		   System.out.println("4 months later: " + calendar.getTime());  
		   calendar.add(Calendar.YEAR, 2);  
		   System.out.println("2 years later: " + calendar.getTime());  
        System.out.println("At present Calendar's Year: " + calendar.get(Calendar.YEAR));
//
        System.out.println("At present Date And Time Is: " + calendar.getTime());
	}

}
