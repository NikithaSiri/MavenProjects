package com.lti.stringmethods;
import java.util.*;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateApiDemos {
	public static void main(String[] args) {
	
	Date today= new Date();
	System.out.println(today);
	
	Instant currentTime=Instant.now();
	System.out.println("CurrenT Time: "+currentTime );
	
	LocalDate localDate=LocalDate.now();
	System.out.println("LocalDate: "+localDate);
	System.out.println(localDate.getDayOfMonth());
	System.out.println(localDate.getDayOfYear());
	System.out.println("ID is on "+localDate.withDayOfMonth(21)+ " Enjoy it's public holiday ");
	
	ZonedDateTime zoneNow = ZonedDateTime.now();
	System.out.println("Zoned Date Time India: "+zoneNow);
	
	LocalDateTime currentDate=LocalDateTime.now();
    System.out.println("Local date time India: "+currentDate);
	Scanner scanner=new Scanner(System.in);
	String input=scanner.nextLine();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YYYY");
    LocalDate enteredDate = LocalDate.parse(input,formatter);
	
    System.out.println("Entered Date:"+ enteredDate);
	scanner.close();
	}
}



/*Instant currentTime=Instant.now();		
		System.out.println("Current Time : "+currentTime);
		
		LocalDate localDate = LocalDate.now();
		System.out.println("LocalDate : "+localDate);
		
		System.out.println("Ramzan ID  is on "+localDate.withDayOfMonth(30) +"  Enjoy it's public holiday");
		
		ZonedDateTime zoneNow = ZonedDateTime.now();
		System.out.println("Zoned Date Time India: "+zoneNow);
		
		ZonedDateTime zoneParis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println("Zoned Date Time Paris: "+zoneParis);
		
		LocalDate currentDate = LocalDate.now();
		
		LocalDate independanceDay = LocalDate.of(1947,Month.AUGUST,15);
		System.out.println("Independance:"+ independanceDay);
		
		
		System.out.println("Today:"+ currentDate);
		System.out.println("Tomorrow:"+ currentDate.plusDays(1));
		System.out.println("Last Month:"+currentDate.minusMonths(1));
		System.out.println("Is Leap?:"+ currentDate.isLeapYear());
		
		
		
		
		
		
			DateTimeFormatter formatter =	DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter date in dd/MM/yyyy format:");
			String input  = scanner.nextLine();			
			//Almost every class in java.time package provides parse() method to parse date  or time
			LocalDate enteredDate = LocalDate.parse(input,formatter);

			System.out.println("Entered Date:"+ enteredDate);
			scanner.close();
		*/