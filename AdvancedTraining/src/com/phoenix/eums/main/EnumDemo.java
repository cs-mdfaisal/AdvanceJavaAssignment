package com.phoenix.eums.main;

import com.phoenix.eums.Color;
import com.phoenix.eums.WeekDay;

public class EnumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Color.BLUE);
		System.out.println("Ordinal: "+Color.BLUE.ordinal());
		
		Color favoriteColor = Color.magenta;
		System.out.println(favoriteColor);
		System.out.println("Ordinal:"+favoriteColor.ordinal());
		
		for(Color color:Color.values())
			System.out.println(color);
	
		System.out.println(WeekDay.THURSDAY);
		System.out.println("Ordinal: "+WeekDay.THURSDAY.ordinal());
		System.out.println("Day No: "+WeekDay.THURSDAY.getDayNo());
		System.out.println("Short Name: "+WeekDay.THURSDAY.getShortName());
		
		
		WeekDay today=WeekDay.TUESDAY;
		System.out.println(today);
		System.out.println("Ordinal: "+today.ordinal());
		
		for(WeekDay day:WeekDay.values())
			System.out.println(day+"\tOrdinal: "+day.ordinal());
		
		WeekDay whichDay=WeekDay.SUNDAY;
		switch (whichDay) {
		case MONDAY:
			System.out.println("Go to office");
			break;
		case TUESDAY:
			System.out.println("Meeting with team");
			break;
		case SATURDAY:
			System.out.println("Weekend");
			break;
		case SUNDAY:
			System.out.println("REST");
			break;
		default:
			System.out.println("Sorry! Wrong choice");
			break;
			
			
			
		}
	}

}
