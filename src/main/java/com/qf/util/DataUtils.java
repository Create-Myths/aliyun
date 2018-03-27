package com.qf.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Thanks for Everything.
 */
public class DataUtils {

	private static SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");


	public static String dateToStr(Date date){
		String exptimeDate = s.format(date);
		return exptimeDate;
	}

	public static Date strToDate(String date){
		Date parse = null;
		try {
			parse = s.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return parse;
	}
}
