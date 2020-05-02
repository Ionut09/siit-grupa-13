package com.siit.collections.maps;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example {
    static Map<String, String> phoneBook = new TreeMap<>();

    public static void main(String... args) {
//        HashMap<String, String> phoneBook1 = new TreeMap<>();

        phoneBook.put("John Travolta", "00219092019");
        phoneBook.put("Arnold Schwartzeneger", "0322128821");
        phoneBook.put("Robert", "0912182812");


        if (phoneBook.containsKey("Stevie Wonder")) {
            phoneBook.replace("Stevie Wonder", "0821981298192");
            phoneBook.replace("Stevie Wonder", "0821981298192", "0162162812");
        } else {
            phoneBook.put("Stevie Wonder", "0821981298192");
        }

        phoneBook.put("Stevie Wonder", "00000000000");
        phoneBook.forEach((key, value) -> System.out.println(key + ":" + value));

        //V apply(K t)
        phoneBook.computeIfAbsent("John Travolta11", key -> {
            System.out.println(key);
            return key;
        });

        phoneBook.forEach((key, value) -> System.out.println(key + ":" + value));

        String robert = phoneBook.get("Bob");
        robert =  phoneBook.getOrDefault("Bob", "000000000000");
        System.out.println("robert = " + robert);

        Set<String> keysFromMap = phoneBook.keySet();

        Set<Entry<String, String>> entries = phoneBook.entrySet();
        entries.forEach(entry -> System.out.println(entry.getKey() + entry.getValue()));


    }

    public Map<String, String> getPhoneBook(){
        return phoneBook;
    }
}
