package day6_13;

import java.util.Calendar;
import java.util.Date;

public class J234 {
	public static void main(String[] args) {
		  Calendar cal = Calendar.getInstance();
		  cal.set(2018, 06, 13);
		  Date testDate = cal.getTime();
		  System.out.println(testDate);
/*
 * 处理月份加1
	  	  Calendar calendar = Calendar.getInstance();
		  calendar.setTime(testDate);
		  calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) + 1);
		  Date testDate2 = calendar.getTime();
		  System.out.println(testDate2);
 */
	}
}
