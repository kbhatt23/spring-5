package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	private static SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
	
	public static Date convertStringToDate(String dateStr)  {
		
		try {
			return df.parse(dateStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String convertDateToString(Date date) {
		return df.format(date);
	}
	
}
