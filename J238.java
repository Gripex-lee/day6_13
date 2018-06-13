package day6_13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class J238 {
	public static Date StringToDate(String string, String pattern) throws ParseException {  
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);  
        Date date = simpleDateFormat.parse(string);  
        return date;  
    }  
      
    /**  
     * 日期转换为字符串  
     * @param date  
     * @param pattern  
     * @return  
     */  
    public static String DateToString(Date date, String pattern) {  
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);  
        String string = simpleDateFormat.format(date);  
        return string;  
    }  
      
    public static void main(String[] args) throws ParseException {  
        // yyyy是年，MM是月，dd是日，    HH是(24小时制)时，hh是(12小时制)时，mm是分，ss是秒  
    	Date date = J237.StringToDate("1981-09-19 09:07:27", "yyyy-MM-dd HH:mm:ss");  
        System.out.println(date); 
    }
}
