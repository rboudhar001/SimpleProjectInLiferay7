package com.rboudhar001.constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * @author Rachid
 */
public abstract class MyDate {

	// Variables

	private static final String DATE_FORMAT = "dd/MM/yyyy";
	private static final DateFormat df = new SimpleDateFormat(DATE_FORMAT);

	/**
	 * ...
	 * 
	 * @return
	 */
	public static DateFormat getDateFormat() {
		
		return df;
	}
}
