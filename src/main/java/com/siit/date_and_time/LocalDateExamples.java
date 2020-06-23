package com.siit.date_and_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * date - LocalDate
 * timp - LocalTime
 * date si timp - LocalDateTime
 * date si timp cu timezone - ZonedDateTime
 * perioade de timp - Period
 * durate de timp - Duration
 * formatarea obiectelor date/time - DateTimeFormatter
 * 12.06.2020 --> dd.MM.yyyy
 * Toate clasele se afla in pachetul java.time
 * {@link java.sql.Timestamp}  --> {@link java.time.Instant}
 */
public class LocalDateExamples {

    public static void main(String... args) {
        LocalDate today = LocalDate.now();
        System.out.println("today = " + today); //default foloseste DateTimeFormatter.ISO_DATE
        LocalDate now = LocalDate.of(2020, 6, 20);
        LocalDate of = LocalDate.of(2020, Month.JUNE, 20);

        today.plusDays(9);
//        today.minusDays(9);

        System.out.println(today.plus(10, ChronoUnit.DAYS));

        var robertBirthdate = LocalDate.parse("1979-02-19");
//        var a = null;  does not work
        robertBirthdate = LocalDate.parse("02-19-1979", DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        System.out.println("robertBirthdate = " + robertBirthdate);

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MMM-dd")));

        robertBirthdate.isLeapYear();
        boolean before = robertBirthdate.isBefore(today);//true
        boolean after = robertBirthdate.isAfter(today);//true
        System.out.println("today after many operations=" + today);

        DayOfWeek dayOfWeek = robertBirthdate.getDayOfWeek();
        System.out.println("mare zi pt omenire = " + dayOfWeek);

        Period robertAge = Period.between(robertBirthdate, today );
        System.out.println("robertAge = " + robertAge.toTotalMonths());

        LocalDate subscriptionEnd = LocalDate.of(2020,9,20);
        if(subscriptionEnd.minusDays(3).isAfter(LocalDate.now())){
            System.out.println("Subscription end");
        }

       if(today.until(subscriptionEnd).getDays() == 3){

       }

        long robertAgeInDays = ChronoUnit.DAYS.between(robertBirthdate, today);
        System.out.println("robertAgeInDays = " + robertAgeInDays);

    }
}
