package com.siit.oop.inner;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.stream.Stream;

interface Behaviour {

    void concat(String input1, String input2);
}

public class ClaseAnonime {


    public static void main(String... args) {

//        class TaskPentruThread implements Runnable {
//            public void run() {
//                System.out.println("running task");
//            }
//        }

        //echivalent cu
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("running task");
            }
        };

        //echivalent cu (lambda expression: merg doar pt interfete/clase abstracte cu o singura metoda abstracta)
        Runnable taskWithLambda = () -> { //singura metoda
            System.out.println("running task from lambda");
        };
        taskWithLambda.run();
//        () => {}

        Behaviour behaviour = (input1, input2) -> {
            System.out.println(input1 + input2);
        };

        behaviour.concat("abc", "def");

        List<String> abc = List.of( //Alex
                "abc",
                "ab",
                "ab",
                "ab",
                "ab",
                "ab",
                "ab",
                "ab",
                "ab",
                "ab"
        );

        Stream<String> stream = abc.stream();

        stream //Stream<string>
               .filter(str -> str.length() == 2)
               .map(str -> str.toUpperCase())
               .forEach(str -> System.out.println(str));

        // void actionPerformed(ActionEvent e);
        ActionListener actionListener = event -> {
            System.out.println(event);
        };
    }
}


