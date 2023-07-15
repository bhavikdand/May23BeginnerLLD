package com.scaler.lld.projects.parking_lot.utils;

import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

    public static int getDayOfWeek(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    public static boolean isWeekend(Date date){
        int dayOfWeek = getDayOfWeek(date);
        return dayOfWeek == 7 || dayOfWeek == 1;
    }

    public static int numberOfHoursSpent(Date entryTime, Date exitTime){
        long ms = exitTime.getTime() - entryTime.getTime();
        int hours = (int) Math.ceil((double) ms / (1000 * 60 * 60));
        return hours == 0? 1: hours;
    }
}
