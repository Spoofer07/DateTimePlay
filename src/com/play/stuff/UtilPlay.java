package com.play.stuff;
import java.time.Instant;
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
		
		/*
		 * notes
		 * year must be year - 1900
		 * the months are between 0 - 11 
		 */
		/*Date date = new Date(118, 11, 15, 17, 10, 1);
		int year = date.getYear() - 1;
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
		
		LocalDateTime localDateTime = LocalDateTime.parse("1992-08-05T12:51:23");
		/*int year = localDateTime.getYear();
		int month = localDateTime.getMonthValue();
		int day = localDateTime.getDayOfMonth();
		int hour = localDateTime.getHour();
		int minute = localDateTime.getMinute();
		int second = localDateTime.getSecond();
 
	    System.out.println("Year: "   + year   + "\n" +
						   "Month: "  + month  + "\n" +
						   "Day: "    + day    + "\n" +
						   "Hour: "   + hour   + "\n" +
						   "Minute: " + minute + "\n" +
						   "Second: " + second + "\n");*/
		
		
	}
	
	
	//comparisons

	//from Date to LocalDate
	public static void fromDateToLocalDate() {
		Date date = new Date(2019-1900, 11, 15, 17, 10, 01);
		
		//LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		//LocalDate localDate = Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate localDate = new java.sql.Date(date.getTime()).toLocalDate();
		
		System.out.println(localDate);
	}
	
	//from Date to LocalDateTime
	public static void fromDateToLocalDateTime() {
		Date date = new Date(2011-1900, 11, 15, 17, 10, 01);
		
		//LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		//LocalDateTime localDateTime = Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDateTime();
		LocalDateTime localDateTime = new java.sql.Timestamp(date.getTime()).toLocalDateTime();
		
		System.out.println(localDateTime);
	}

	//from date to LocalTime
	public static void fromDateToLocalTime() {
		Date date = new Date(2011-1900, 11, 15, 17, 10, 01);
		
		//LocalTime localTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
		LocalTime localTime = Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalTime();
		
		System.out.println(localTime);
	}
	
	//from LocalDate to Date
	public static void fromLocalDateToDate() {
		LocalDate localDate = LocalDate.parse("2007-12-03");
		
		//Date date = java.sql.Date.valueOf(localDate);
		//THIS ALSO SETS THE TIME(0 IF NOT SPECIFIED)
		Date date = java.util.Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
		
		System.out.println(date);
	}
	
	//fromLocalDateTime to Date
	public static void fromLocalDateTimeToDate() {
		LocalDateTime localDateTime = LocalDateTime.parse("1992-08-05T12:51:23");
		
		//Date date = java.sql.Timestamp.valueOf(localDateTime);
		Date date = java.util.Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
		
		System.out.println(date);
	}
	
	//play with localdatetime

	//play with Joda
	
	//get tomorrow/yesterday

}
