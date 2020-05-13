package com.siit.streams.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.of;

public class Example {

    public static void main(String... args) {
        String[] array = {"1", "2"};

        Stream<String> stream = Arrays.stream(array);

        List<String> words = of("laptop", "bank", "headphones");
        Set<String> charsList = words
                .stream()
                .map(word -> word.split(""))//{"l","a",...}
                .flatMap(arrayDeString -> Arrays.stream(arrayDeString))//Stream<String>
                .distinct()
                .sorted()
                .peek(System.out::println)
                .collect(Collectors.toSet());

//        Collectors --> contine factory methods care creaza obiecte colectori (ce implementeaza Collector)

        System.out.println("charsList = " + charsList);
//        stream.forEach(System.out::println); //pe un stream putem apela o operatie terminala o singura data

        stream.forEach(System.out::println);

        //int applyAsInt(T value)
        int sum = words.stream()
//                      .mapToInt(word -> word.length())
                       .mapToInt(String::length)
                       .sum();

        //collecting elements
        Map<String, Set<String>> collectWithGrouping = words.stream()
                                                            .collect(Collectors.groupingBy(word -> word.toUpperCase(), Collectors.toSet()));
        System.out.println("collectWithGrouping = " + collectWithGrouping);

        Map<Integer, Set<String>> collectWithGrouping1 = words.stream()
                                                              .filter(word -> word.equals(""))
                                                              .collect(Collectors.groupingBy(word -> 5, Collectors.toSet()));
        System.out.println("collectWithGrouping = " + collectWithGrouping1);


        Map<Boolean, List<String>> collectWithpartitioningBy = words.stream()
                                                                   .collect(Collectors.partitioningBy(word -> word.length() > 3));

        System.out.println("collectWithpartitioningBy = " + collectWithpartitioningBy);
        System.out.println("allTrueElements = " + collectWithpartitioningBy.get(true));

    }
}
