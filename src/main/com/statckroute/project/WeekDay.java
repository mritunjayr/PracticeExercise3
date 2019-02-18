//3. Write a java program to calculate first and last date of a week.
//        Output:
//        First Date of Week: Mon 24/07/2017
//        Last date of the week: Sun 30/07/2017
package com.statckroute.project;

import java.util.Calendar;
import java.util.Date;
public class WeekDay {
    public Date firstDayOfWeek( Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.getFirstDayOfWeek());
        return calendar.getTime();
    }

    public Date lastDayOfWeek( Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        calendar.set(Calendar.DAY_OF_WEEK,calendar.SUNDAY);
        return calendar.getTime();
    }
}
