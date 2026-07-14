package com.wipro.datetime;

import java.time.LocalDate;

public class TodayDateAfterTenDays {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate afterTenDays = today.plusDays(10);

        System.out.println("Today's Date : " + today);
        System.out.println("After 10 Days : " + afterTenDays);
    }

}