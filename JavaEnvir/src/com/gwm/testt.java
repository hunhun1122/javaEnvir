package com.gwm;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertWeekByDate(new Date());
	}
	
/****
 * 计算某日期所在周的周一和周日日期。周一为所在周的第一天！
 * @param time
 */
	private static void convertWeekByDate(Date time) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // 设置时间格式

		Calendar cal = Calendar.getInstance();

		cal.setTime(time);

		// 判断要计算的日期是否是周日，如果是则减一天计算周六的，否则会出问题，计算到下一周去了

		int dayWeek = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几天

		if (1 == dayWeek) {

			cal.add(Calendar.DAY_OF_MONTH, -1);

		}

		System.out.println("要计算日期为:" + sdf.format(cal.getTime())); // 输出要计算日期

		cal.setFirstDayOfWeek(Calendar.MONDAY);// 设置一个星期的第一天，按中国的习惯一个星期的第一天是星期一

		int day = cal.get(Calendar.DAY_OF_WEEK);// 获得当前日期是一个星期的第几天

		cal.add(Calendar.DATE, cal.getFirstDayOfWeek() - day);// 根据日历的规则，给当前日期减去星期几与一个星期第一天的差值

		String imptimeBegin = sdf.format(cal.getTime());

		System.out.println("所在周星期一的日期：" + imptimeBegin);

		cal.add(Calendar.DATE, 6);

		String imptimeEnd = sdf.format(cal.getTime());

		System.out.println("所在周星期日的日期：" + imptimeEnd);

	}

}
