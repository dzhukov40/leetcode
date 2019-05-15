package ru.doneathome.test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test2 {

    public static void main(String[] args) {
        Calendar calendarDataTo = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendarDataTo.setTime(new Date());


        System.out.println(calendarDataTo.getTime());

        calendarDataTo.setTime(new Date());
        calendarDataTo.add(Calendar.DATE, -30); // month ago

        System.out.println(calendarDataTo.getTime());

    }


}
