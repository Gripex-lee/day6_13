package day6_13;

import java.util.Calendar;
import java.util.Date;

public class J241 {
	public static void main(String[] args) {
		  Calendar cal = Calendar.getInstance();
		  cal.set(2013, 12, 25);
		  cal.add(Calendar.MONTH, -1 ); //set方法  对30天的月份显示正常
		  Date testDate = cal.getTime();
		  System.out.println(J241.getWeekOfDate(testDate));
	}
	
	public static int getWeekOfDate(Date dt) {
        int[] weekDays = {0, 1, 2, 3, 4, 5, 6};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }
}
