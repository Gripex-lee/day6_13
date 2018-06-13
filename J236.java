package day6_13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class J236 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);
		Calendar c=new GregorianCalendar();
		c.setTime(date);
		c.add(c.YEAR, 1);
		System.out.println(c.getTime());
		c.add(c.MONTH, -3);
		System.out.println(c.getTime());
	}
}
