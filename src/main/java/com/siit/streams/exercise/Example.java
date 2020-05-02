package com.siit.streams.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.of;

public class Example {

    public static void main(String... args) {
        String[] array = {"1", "2"};

        Stream<String> stream = Arrays.stream(array);

        List<String> words = of("laptop", "bank", "headphones");
        List<String> charsList = words
                .stream()
                .map(word -> word.split(""))//{"l","a",...}
                .flatMap(arrayDeString -> Arrays.stream(arrayDeString))//Stream<String>
                .distinct()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println("charsList = " + charsList);
        stream.forEach(System.out::println); //pe un stream putem apela o operatie terminala o singura data

        stream.forEach(System.out::println);

        //int applyAsInt(T value)
        int sum = words.stream()
//                      .mapToInt(word -> word.length())
                       .mapToInt(String::length)
                       .sum();


    }
}
