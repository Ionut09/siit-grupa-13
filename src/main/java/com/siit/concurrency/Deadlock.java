package com.siit.concurrency;

public class Deadlock {

    public static void main(String... args) {
        Object A = new Object();
        Object B = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (A) {
                System.out.println("Acquired lock A");
                System.out.println("Now I want lock for B");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (B) {
                System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (B) {
                System.out.println("Acquired lock B");
                System.out.println("Now I want lock for A");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (A) {
                System.out.println("WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW");
            }
        });

        t1.start();
        t2.start();
    }
}
