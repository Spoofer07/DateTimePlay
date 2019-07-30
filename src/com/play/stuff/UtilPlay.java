package com.play.stuff;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;
import java.util.TimeZone;

public class UtilPlay {

	
	/*
	    int year = ;
		int month = ;
		int day = ;
		int hour = ;
		int minute = ;
		int second = ;
 
	    System.out.println("Year: "   + year   +  "\n" +
						   "Month: "  + month  + "\n" +
						   "Day: "    + day    + "\n" +
						   "Hour: "   + hour   + "\n" +
						   "Minute: " + minute + "\n" +
						   "Second: " + second + "\n");
	 * */
	
	
	//printlns
	public static void printlns() {	
		
		Date date = new Date(1987, 12, 15, 17, 10, 01);
		/*int year = date.getYear();
		int month = date.getMonth();
		int day = date.getDate();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		System.out.println("Year: "   + year   + "\n" +
						   "Month: "  + month  + "\n" +  
						   "Day: "    + day    + "\n" +
						   "Hour: "   + hour   + "\n" +
						   "Minute: " + minute + "\n" +
						   "Second: " + second + "\n");*/
		
		LocalDate localDate = LocalDate.parse("2007-12-03");
		/*int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		int hour = 0;
		int minute = 0;
		int second = 0;
 
	    System.out.println("Year: "   + year   + "\n" +
						   "Month: "  + month  + "\n" +
						   "Day: "    + day    + "\n" +
						   "Hour: "   + hour   + "\n" +
						   "Minute: " + minute + "\n" +
						   "Second: " + second + "\n");*/
		
		
		
		
	}
	
	
	//comparisons

	//from date to LocalDate

	//from date to LocaleDateTime

	//play with localdatetime

	//play with Joda
	
	//get tomorrow/yesterday

}
