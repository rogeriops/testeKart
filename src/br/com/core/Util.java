package br.com.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	
	public static Long formatTime(String time, SimpleDateFormat formatter) throws ParseException {
		//DateFormat formatter = new SimpleDateFormat( "HH:mm:ss.SSS");
		Date date = formatter.parse(time);
		return date.getTime();
	}
	public static  String formartString(String vel){
		return vel.replace(",", ".");
	}
	
	public static String formatTempo(Long date){
		SimpleDateFormat sd = new SimpleDateFormat("mm:ss.SSS") ;
		return sd.format(new Date(date));
	}

}
