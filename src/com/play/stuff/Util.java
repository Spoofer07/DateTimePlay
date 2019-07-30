package com.play.stuff;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

public class Util {

	
	/*
	 *  Initializations with:
	 *  Date
	 *  GregorianCalendar
	 *  LocalDate
	 *  LocalTime
	 *  LocalDateTime
	 */
	public static void dateInit() {
		Date date = new Date();
		//System.out.println(date);
		
		Date date2 = new Date("12/12/2012");
		//System.out.println(date2);
		
		Date date3 = new Date(1987, 12, 15, 17, 10, 01);
		//System.out.println(date3);
		
		GregorianCalendar greg = new GregorianCalendar();
		//System.out.println(greg.getTime());
		
		GregorianCalendar greg2 = new GregorianCalendar(2011, 12, 8, 03, 15, 15);
		//System.out.println(greg2.getTime());
		//System.out.println(greg2.get(Calendar.HOUR));
		//System.out.println(greg2.get(Calendar.MONTH));

		GregorianCalendar greg3 = new GregorianCalendar(2018, 5, 30);
	    greg3.add(Calendar.DATE, 1);
	    /*System.out.println(greg3.getTime());
	    System.out.println(greg3.getActualMaximum(Calendar.DAY_OF_MONTH));
	    System.out.println(greg3.getLeastMaximum(Calendar.DAY_OF_MONTH));
	    System.out.println(greg3.getMaximum(Calendar.DAY_OF_MONTH));*/
		
		LocalDate localDate = LocalDate.now();
		//System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.parse("2007-12-03");
		//System.out.println(localDate2);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate3 = LocalDate.parse("31/05/1992", formatter);
		//System.out.println(localDate3);
		
		LocalDate localDate4 = LocalDate.of(2012, 04, 30);
		//System.out.println(localDate4);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		//System.out.println(localDateTime);
		
		LocalDateTime localDateTime2 = LocalDateTime.parse("1992-08-05T12:51:23");
		//System.out.println(localDateTime2);
		
		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime localDateTime3 = LocalDateTime.parse("1995-03-05 17:51:23", timeFormatter);
		//System.out.println(localDateTime3);
		
		LocalDateTime localDateTime4 = LocalDateTime.of(2001, 07, 15, 12, 30);
		//System.out.println(localDateTime4);
		
		LocalDateTime localDateTime5 = LocalDateTime.of(2001, Month.AUGUST, 15, 12, 30);
		//System.out.println(localDateTime5);
		
		LocalTime localTime = LocalTime.now();
		//System.out.println(localTime);
		
		LocalTime localTime2 = LocalTime.parse("17:30");
		//System.out.println(localTime2);
		
		LocalTime localTime3 = LocalTime.of(14, 12, 11);
		//System.out.println(localTime3);
		//System.out.println(localTime2.isAfter(localTime3));
		
		LocalTime localTime4 = LocalTime.MAX;
		//System.out.println(localTime4);
		
		
		//getAllzones
		Set<String> allZones = ZoneId.getAvailableZoneIds();
		for(String s : allZones) {
			//System.out.println(s);
		}
		 
	}
	
	//printlns
	
	//from date to LocalDate
	
	//from date to LocaleDateTime
	
	
	//play with localdatetime
	
	//play with Joda
}
