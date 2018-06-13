package day6_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class J253 {
	public static String DateToString(Date date, String pattern) {  
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);  
        String string = simpleDateFormat.format(date);  
        return string;  
    } 
	public static void main(String[] args) {
		String string = J253.DateToString(new Date(), "yyyy-MM-dd HH:mm:ss");  
        System.out.println(string);
	}
}
