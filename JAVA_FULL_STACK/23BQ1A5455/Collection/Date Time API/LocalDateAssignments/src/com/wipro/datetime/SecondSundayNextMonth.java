package com.wipro.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SecondSundayNextMonth {

    public static void main(String[] args) {

        LocalDate firstDay = LocalDate.now()
                                      .plusMonths(1)
                                      .withDayOfMonth(1);

        while (firstDay.getDayOfWeek() != DayOfWeek.SUNDAY) {
            firstDay = firstDay.plusDays(1);
        }

        LocalDate secondSunday = firstDay.plusWeeks(1);

        System.out.println("Second Sunday of Next Month: " + secondSunday);

    }

}