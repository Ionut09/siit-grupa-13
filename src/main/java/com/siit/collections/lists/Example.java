package com.siit.collections.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Example {

    public static void main(String... args) {
        List<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("C++");
        languages.add(1, "Javascript");
        languages.add("Perl");
        languages.add("Scala");
        //cand e aici ietartorul-->hasNext=true , next = Python, remove -->Python
        languages.add("Python");
        //e aici iteratorul dupa apelul lui next

        languages.forEach((language) -> {
//            languages.remove("C++"); //java.util.ConcurrentModificationException
            System.out.println(language);
        });

        int scalaIndex = languages.indexOf("Scala"); //4 se foloseste de equals
        languages.remove("Perl");
        System.out.println(languages.size());//5

        if (languages.contains("SQL")) { //se foloseste de equals
            System.out.println("SQL already in the list");
        } else {
            languages.add("SQL");
        }

        //stergere element in timpul iteratiei
        Iterator<String> iterator = languages.iterator(); //tine o copie temporara

        while (iterator.hasNext()) { //nu face nimic, doar returneaza true/false
            // daca iteratorul are un element in vecinatatea sa
            String currentElement = iterator.next();

            if (currentElement.equals("Python")) {
                iterator.remove(); //efect asupra elementului curent
            }
        }

        languages.forEach(System.out::println);

        Object[] objects = languages.toArray();
        String[] strings = languages.toArray(new String[0]); //daca incap elementele in el -->il returneaza, altfel aloca altul
        System.out.println(strings.length); //dim listei

        languages.sort(null);

        Comparator<String> comparator = Comparator.naturalOrder();
        Collections.sort(languages, comparator.reversed()); //avem elemente comparabile

        System.out.println(" after sort");
        languages.forEach(System.out::println);
    }

    public <T> void sort(List<T> list) {
        list.sort(null);
    }
}
