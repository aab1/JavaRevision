package DateAndTimeLesson9;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateAndTime {

	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		
		int day = calendar.getWeeksInWeekYear();
		System.out.println("Calendar weeks of the year "+day);
		
		System.out.println(date.toString());
		System.out.println(date.getTime());
		System.out.println(date.getMonth()+1);
		System.out.println(date.getDay());
		System.out.println(date.getYear()+1900);
		
		//https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		//the url shows the pattern that can be used for the SimpleDateFormat class in java docs
		SimpleDateFormat sdf = new SimpleDateFormat("E: dd/M/yyyy  HH-mm-ss");
		System.out.println(sdf.format(date));

	}

}
