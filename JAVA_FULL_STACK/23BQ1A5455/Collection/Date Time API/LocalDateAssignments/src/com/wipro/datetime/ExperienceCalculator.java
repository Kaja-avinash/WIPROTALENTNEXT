package com.wipro.datetime;

import java.time.LocalDate;
import java.time.Period;

public class ExperienceCalculator {

    public static void main(String[] args) {

        LocalDate joiningDate = LocalDate.of(2023, 1, 10);

        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Joining Date : " + joiningDate);
        System.out.println("Today's Date : " + today);

        System.out.println("Experience :");

        System.out.println(experience.getYears() + " Years");
        System.out.println(experience.getMonths() + " Months");
        System.out.println(experience.getDays() + " Days");

    }

}