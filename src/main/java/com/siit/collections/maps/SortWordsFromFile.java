package com.siit.collections.maps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toMap;

public class SortWordsFromFile {

    public static void main(String... args) throws IOException {
        Path path = Paths.get("example_maps.txt");

        List<String> allWordsFromFile = Files.lines(path)
                                             .map(line -> line.split("[^a-zA-Z]+"))
                                             .flatMap(arrayOfWords -> Arrays.stream(arrayOfWords))
                                             .filter(word -> !word.trim().isEmpty())
                                             .peek(word -> System.out.println("word = " + word))
                                             .collect(Collectors.toList());
        //LinkedHashMap
        Map<String, Integer> map = new HashMap<>();

        for (String word : allWordsFromFile) {
            if (map.containsKey(word)) {
                Integer initialNumberOfOccurences = map.get(word);
                map.put(word, initialNumberOfOccurences + 1);
            } else {
                map.put(word, 1);
            }
        }

        var comparator = Comparator.<Entry<String, Integer>, Integer>comparing(Entry::getValue).reversed().thenComparing(Entry::getKey);

        map = map.entrySet()
                 .stream()
                 .sorted(comparator)
                 .collect(toMap(entry -> entry.getKey(),
                                entry -> entry.getValue(),
                                (key, value) -> value,
                                 () -> new LinkedHashMap<>()));

        List<Entry<String, Integer>> entryList =new ArrayList<>();
        entryList.addAll(map.entrySet());
        entryList.sort(comparator);

        Map<String, Integer> variantaFaraBrainFuck = new LinkedHashMap<>();
        entryList.forEach(entry -> variantaFaraBrainFuck.put(entry.getKey(), entry.getValue()));

        variantaFaraBrainFuck.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
