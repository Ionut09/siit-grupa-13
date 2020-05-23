package com.siit.concurrency;

import java.util.concurrent.ExecutionException;

public class Example {

    public static void main(String... args) throws InterruptedException, ExecutionException {
//        System.exit(0);
        Thread thredulica = new ThreadWithThreadClass();
        thredulica.start();

        Thread vasilica = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                Thread.currentThread().setName("Vasilica");
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    thredulica.sleep(1000);
                } catch (InterruptedException e) {
                }
            }
        });
        vasilica.setDaemon(true);
        vasilica.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.sleep(10);
        }

    }


}
