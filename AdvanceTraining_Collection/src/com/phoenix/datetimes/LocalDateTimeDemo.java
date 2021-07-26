package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalDate anyDate=LocalDate.of(1947, 8, 15);
		System.out.println(anyDate);
		
		//Local time
		LocalTime lt=LocalTime.now();
		System.out.println(lt);
		
		LocalTime anyTime=LocalTime.of(5, 23, 56);
		System.out.println(anyTime);
		
		//Local DateTime
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		LocalDateTime anyDateTime=LocalDateTime.of(anyDate, anyTime);
		System.out.println(anyDateTime);
	
		
		//ZoneDateTime
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt);
		
		//Checking default zone of computer system
		ZoneId defaultZone=ZoneId.systemDefault();
		System.out.println(defaultZone);
		
		
		System.out.println("\nAvailable Filtered Zones");
		Set<String> zones=ZoneId.getAvailableZoneIds();
		//zones.stream().forEach(System.out::println);
		//zones.stream().sorted().forEach(System.out::println);
		zones.stream()
		.sorted().
		filter(z->z.startsWith("I"))
		.forEach(System.out::println);
		
		
		zones.stream()
		.sorted().
		filter(z->z.startsWith("I") ||z.startsWith("America"))
		.forEach(System.out::println);

		
		
		System.out.println("\nCustom ZonedDateTime");
		ZoneId zn=ZoneId.of("US/Hawaii");
		ZonedDateTime zdt1=ZonedDateTime.of(anyDateTime, zn);
		System.out.println(zdt1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
