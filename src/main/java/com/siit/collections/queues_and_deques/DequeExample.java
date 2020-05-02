package com.siit.collections.queues_and_deques;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public static void main(String... args) {
        Deque<String> dequeOfCards = new LinkedList<>();
        Deque<String> dequeOfCards1 = new ArrayDeque<>();

        dequeOfCards.addFirst("A-pica");
        String pop = dequeOfCards.pop();
        String poll = dequeOfCards.poll();
        dequeOfCards.addFirst("A-inima");
    }
}
