package com.company.common.types;

public class CompanyStringDay {
	
	private String day;

	public CompanyStringDay(String day) {
		validate(day);
		this.day = day;
	}
	
	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}
	
	private void validate(String day) {
		
		if (Integer.valueOf(day) < 1 ||  Integer.valueOf(day) > 31) {
			System.out.println(" ... date is malformed.  Day is out of normal range.");
		}
		
	}
	
	public String toString() {
		return "[" + day + "]";
	}
	
}
