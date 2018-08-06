package com.ambow.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeFormat {
	public static Date addTime(Date start,int days) {
		Calendar c = Calendar.getInstance();
		c.setTime(start);
		c.add(Calendar.DAY_OF_MONTH, days);
		return c.getTime();
	}
	public static String dateToString(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return formatter.format(date);	
	}
	public static Date  stringToDate(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			return formatter.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static int getDays(Date now,Date date) {
		if(!now.after(date)) {
			return 0;
		}
		long t1 = now.getTime();
		long t2 = date.getTime();
		long ei = t1-t2;
		return (int)(ei/(1000*60*60*24));
	}
}
