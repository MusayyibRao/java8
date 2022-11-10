package dateTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTimeDemo {

	public static void main(String args[])	

	{

		//String pattern="dd/MMM/yyyy";
		//String pattern="dd/MMM/yyyy HH:mm:ss a";
		//String pattern="dd/MM/yyyy HH:mm:ss a";   // time pattern 24 hours    
		//	String pattern="dd/MMM/yyyy h:mm:ss a";  // time pattern 12 hours
		String pattern="dd-MM-yyyy h:mm:ss a";  // time pattern 12 hours

		SimpleDateFormat simple=new SimpleDateFormat(pattern);

		simple.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));

		Calendar calender=Calendar.getInstance();

		String date=simple.format(calender.getTime());


		System.out.println(date);




	}
}
