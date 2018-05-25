package dateAndTimeJavaUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;  

public class DateAndTime {

	public static void main(String[] args) throws ParseException {
		//long millis=System.currentTimeMillis();
//		Date date=new Date();  
//		System.out.println(date);
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
     int y=calendar.getMaximum(Calendar.DAY_OF_WEEK);
     System.out.println(y);
     //
     Date currentDate = new Date(); 
     
     System.out.println("Current Date: "+currentDate);  
     String dateToStr = DateFormat.getDateInstance().format(currentDate);
     System.out.println("Date Format using getInstance(): "+dateToStr);  
      
     dateToStr=DateFormat.getTimeInstance().format(currentDate);
     System.out.println("Date Format using getInstance(): "+dateToStr); 
     ///
   
     String string="31/03/2018";
     SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
         Date date3 = formatter.parse(string);  
         System.out.println("Date is: "+date3);
//         //
         Date currentDate2 = new Date(2012/4/21);
         SimpleDateFormat formatter2=new SimpleDateFormat("dd/MM/yyyy");
        String s=formatter2.format(currentDate2);
        System.out.println("date to string"+s); 
         
      //
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse("2009-12-31");
        Date date2 = sdf.parse("2010-01-31");

        System.out.println("date1 : " + sdf.format(date1));
        System.out.println("date2 : " + sdf.format(date2));

        if (date1.compareTo(date2) > 0) {
            System.out.println("Date1 is after Date2");
        } else if (date1.compareTo(date2) < 0) {
            System.out.println("Date1 is before Date2");
        } else if (date1.compareTo(date2) == 0) {
            System.out.println("Date1 is equal to Date2");
        } else {
            System.out.println("How to get here?");
        }
	}

}
