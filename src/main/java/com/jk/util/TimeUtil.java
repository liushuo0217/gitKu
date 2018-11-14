package com.jk.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

	public static String format(Date date,String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		String format2 = simpleDateFormat.format(date);
		return format2;
	}
	public static String format(Date date) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String format2 = simpleDateFormat.format(date);
		return format2;
	}
	
}
