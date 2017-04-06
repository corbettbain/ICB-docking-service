package com.jiaqu.icb.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static String dateFormat(String format){
		Date nowTime=new Date(); 
		System.out.println(nowTime); 
		SimpleDateFormat time=new SimpleDateFormat(format); 
		System.out.println(time.format(nowTime)); 
		return time.format(nowTime);
	}
}
