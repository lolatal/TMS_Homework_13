package com.tms.date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task_1_and_2 {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2021, Calendar.MAY, 26);
        System.out.println("Номер заданного дня недели: " + calendar.get(Calendar.DAY_OF_WEEK));
        Date date = new Date();
        SimpleDateFormat formatForDate = new SimpleDateFormat("E");
        System.out.println("День недели сегодня: " + formatForDate.format(date).toUpperCase());
        LocalDate today = LocalDate.now();
        int numberOfDaysToAdd = 32 - today.getDayOfMonth();
        LocalDate nextTuesdayDate = today.plusDays(numberOfDaysToAdd);
        System.out.println("Дата следующего вторника:  " + nextTuesdayDate);
    }
}
