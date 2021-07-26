package com.phoenix.eums;

public enum WeekDay {
	SUNDAY,MONDAY(20,"mon"),TUESDAY,WEDNESDAY(34),THURSDAY(300,"thur"),FRIDAY(4),SATURDAY;
	
	private int dayNo;
	private String shortName;
	private WeekDay() {
		// TODO Auto-generated constructor stub
		dayNo=-1;
		System.out.println("No-Arg Constructor of enum WeekDay");
		
	}
	WeekDay(int dayNo){
		this.dayNo=dayNo;
		System.out.println("Single Parametrized constructor of enum WeekDay");
	}
	WeekDay(int dayNo,String sNm){
		this.dayNo=dayNo;
		shortName=sNm;
		System.out.println("Two Parameterized constructor of enum weekDay");
	}
	public int getDayNo() {
		return dayNo;
	}
	public String getShortName() {
		return shortName;
	}
	



}
