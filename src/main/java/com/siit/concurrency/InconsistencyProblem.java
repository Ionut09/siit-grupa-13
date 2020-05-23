package com.siit.concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class InconsistencyProblem {

    static class InconsistentClass {

        int count = 0;

        AtomicInteger countAtomic = new AtomicInteger(2);

        public void add(int value) {
            synchronized (this) {
                /*
                    read current count val
                    increment it
                    write it new value
                 */
                List<Object> objects = Collections.synchronizedList(new ArrayList<>());
                objects.add("some");
                count += value; //t1 si t2 sa citeasca aceeasi valoare --> possible race condition
            }

            //bar in loc de asta avem varianta urmatore
            int i = countAtomic.addAndGet(value);

            countAtomic.getAndIncrement();
            countAtomic.incrementAndGet();
            System.out.println(count);
            System.out.println(++count);
            System.out.println(count++);
            notifyAll();
//            wait();
            notify();
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String... args) {
        InconsistentClass inconsistentObject = new InconsistentClass();
        ExecutorService pool = Executors.newFixedThreadPool(8);
        pool.execute(() -> {
            for (int i = 0; i <= 100; i++) {
                inconsistentObject.add(5);
            }
        });

//        pool.execute(() -> {
//            for (int i = 0; i <= 10; i++) {
//                inconsistentObject.add(5);
//            }
//        });
//        pool.execute(() -> {
//            for (int i = 0; i <= 10; i++) {
//                inconsistentObject.add(5);
//            }
//        });
//        pool.execute(() -> {
//            for (int i = 0; i <= 10; i++) {
//                inconsistentObject.add(5);
//            }
//        });


//        pool.execute(() -> {
//            inconsistentObject.add(2);
//            try {
////                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(inconsistentObject.getCount());
//        });
//        pool.execute(() -> {
//            inconsistentObject.add(2);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(inconsistentObject.getCount());
//        });
//        pool.execute(() -> {
//            inconsistentObject.add(2);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(inconsistentObject.getCount());
//        });
//        pool.execute(() -> {
//            inconsistentObject.add(2);
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println(inconsistentObject.getCount());
//        });
//

    }
}
