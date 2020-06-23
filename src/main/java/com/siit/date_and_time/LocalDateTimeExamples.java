package com.siit.date_and_time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

public class LocalDateTimeExamples {

    public static void main(String... args) throws InterruptedException {
        //nu contine informatii de timezone, doar ZOnedDateTime are asta
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today = " + today);
        today = LocalDateTime.parse("2020-06-19T10:24:05");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy'T'HH:mm:ss");
        today = LocalDateTime.parse("06/19/2020T10:24:05", formatter);
//        today --> il fol in app
        System.out.println("today = " + today.format(formatter));

        LocalDateTime nowInParis = LocalDateTime.now(ZoneId.of("Europe/Paris"));
        LocalDateTime nowInBucharest = LocalDateTime.now(ZoneId.of("Europe/Bucharest"));
        System.out.println("nowInBucharest = " + nowInBucharest);
        System.out.println("nowInParis = " + nowInParis);

        ZonedDateTime timeInBucharestWithTimezone = ZonedDateTime.now();
        System.out.println("timeInBucharestWithTimezone = " + timeInBucharestWithTimezone);
        System.out.println("timeInParisWithTimezone = " + ZonedDateTime.now(ZoneId.of("Europe/Paris")));

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(System.out::println);

        ZonedDateTime zonedDateTime = today.atZone(ZoneId.of("Europe/Paris"));
        long until = today.until(LocalDateTime.now().plusWeeks(1), HOURS);

        HOURS.between(nowInBucharest, LocalDateTime.of(2021,1,1,0,0,0));

        LocalDateTime start = LocalDateTime.now();
//        Thread.sleep(2000);
        LocalDateTime end = LocalDateTime.now();
        System.out.println(start.truncatedTo(MINUTES).equals(end.truncatedTo(MINUTES)));

        ZonedDateTime robertBirthTimeInParis = ZonedDateTime.parse("19-02-1979T07:00 Europe/London", DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm z"));

        System.out.println("robertBirthTimeInParis = " + LocalDateTime.ofInstant(robertBirthTimeInParis.toInstant(), ZoneId.of("Australia/Lindeman")));
    }

}
