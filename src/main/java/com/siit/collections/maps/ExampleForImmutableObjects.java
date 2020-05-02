package com.siit.collections.maps;

import java.util.HashMap;
import java.util.Map;

//dorim sa-l facem immutabil == nu poate fi modificat dupa creare
public class ExampleForImmutableObjects { //nu va fi imutabil

    private final Map<String, String> phoneBook = new HashMap<>();

    public ExampleForImmutableObjects() {
    }

    public static void main(String... args) {
        ExampleForImmutableObjects example = new ExampleForImmutableObjects();
        Map<String, String> phoneBook = example.getPhoneBook();

        phoneBook.put("John Travolta", "00219092019");
        phoneBook.put("Arnold Schwartzeneger", "0322128821");
        phoneBook.put("Robert", "0912182812");

        System.out.println("Phonebook before getting HashMap");
        phoneBook.forEach((key, value) -> System.out.println(key + ":" + value));

        example.getPhoneBook().put("Ionut", "0761325821");

        System.out.println("Phonebook after getting HashMap");
        //falsa imutabilitate
        phoneBook.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    public Map<String, String> getPhoneBook() {
        return new HashMap<>(phoneBook);
    }
}
