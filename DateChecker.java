package com.sujay;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateChecker {
	/**
	 * this method checks whether the given date is in MM/dd/yyyy format or not
	 * @param date
	 * @return
	 */
	public boolean isValid(String date) {
		String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
	    if (date == null || !date.matches(regex))
	        return false;
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
	    simpleDateFormat.setLenient(false);
	    try {
	        simpleDateFormat.parse(date);
	        return true;
	    } catch (ParseException parseException) {
	    	System.out.println(parseException.getMessage());
	        return false;
	    }
	}
}

