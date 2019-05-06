package ru.doneathome.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestJavaCode {

    private static final String DATE_FORMAT = "dd.MM.yyyy HH:mm '('z', UTC' X')'";
    private static final String TIME_ZONE_FORMAT = "z";

    public static void main(String[] args) {
        Calendar dateNow = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        //Date localTime = new Date();

        Date localTime = dateNow.getTime();
        DateFormat df = new SimpleDateFormat(DATE_FORMAT);
        DateFormat tz = new SimpleDateFormat(TIME_ZONE_FORMAT);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(df.format(localTime));
        System.out.println(tz.format(localTime));



    }
}
