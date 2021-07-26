package com.phoenix.datetimes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate date=LocalDate.of(1947, 8, 15);
		System.out.println("Original date format: "+date);

		DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		
		DateTimeFormatter formatter2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter formatter3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter formatter4=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		
		String formattedDate1=date.format(formatter1);
		String formattedDate2=date.format(formatter2);
		String formattedDate3=date.format(formatter3);
		String formattedDate4=date.format(formatter4);
		
		System.out.println("FULL: "+formattedDate1);
		System.out.println("LONG: "+formattedDate2);
		System.out.println("MEDIUM: "+formattedDate3);
		System.out.println("SHORT: "+formattedDate4);
		
		
		
		//Custom DateFormat
		/*DateTimeFormatter dtf=
				DateTimeFormatter.ofPattern("MM dd, yyyy");
		System.out.println("Custom Format: "+date.format(dtf));
		
		*/
		/*DateTimeFormatter dtf=
				DateTimeFormatter.ofPattern("dd MMMM, yyyy");
		System.out.println("Custom Format: "+date.format(dtf));
		*/
		
		DateTimeFormatter dtf=
				DateTimeFormatter.ofPattern("dd/MM/ yyyy");
		System.out.println("Custom Format: "+date.format(dtf));
		
		
		LocalTime anyTime=LocalTime.of(5, 23, 56);
		System.out.println("Original Format of Time: "+anyTime);

		
		//DateTimeFormatter timeFmt
		//=DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		
		//DateTimeFormatter timeFmt
			//	=DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		
		DateTimeFormatter timeFmt = 
				DateTimeFormatter.ofPattern("hh:mm:ss");
		String fmtTime=anyTime.format(timeFmt);
		System.out.println("Formatted Time: "+fmtTime);
		
		
		
		
	}

}
