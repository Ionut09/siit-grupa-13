package com.siit.collections.queues_and_deques;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String... args) {
        /*
        Summary of Queue methods
                Throws exception	Returns special value
        Insert	        add(e)	    offer(e)
        Remove	       remove()	    poll()
        Examine	        element()	peek()
         */
        Queue<String> waitingToCarrefour = new LinkedList<>();
        //toate colectiile suprascriu toString()

        waitingToCarrefour.offer("John");
        waitingToCarrefour.offer("John");
        waitingToCarrefour.add("Ionut");
        waitingToCarrefour.offer("Mihai");
        waitingToCarrefour.offer(null);

        System.out.println("waitingToCarrefour = " + waitingToCarrefour);
    }
}
