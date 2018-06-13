package day6_13;

import java.util.Calendar;
import java.util.Date;

public class J233 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date.getTime());
		Calendar c = Calendar.getInstance(); 
		//距1970.1.1零时的毫秒数
        c.setTime(date);  
        //加一天
        c.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(c.getTime().getTime());
        //当前日期设为增加一天后的日期
        date.setTime(c.getTimeInMillis());
        System.out.println(date);
	}
}
