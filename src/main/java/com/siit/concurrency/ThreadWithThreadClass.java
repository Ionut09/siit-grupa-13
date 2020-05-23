package com.siit.concurrency;

import lombok.SneakyThrows;

public class ThreadWithThreadClass extends Thread {

    @SneakyThrows
    public void run(String s) {
        for (int i = 1; i <= 10; i++) {
            Thread.currentThread().setName("thredulica");
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.sleep(10);
        }
    }

    @SneakyThrows
    public void run() {
        for (int i = 1; i <= 10; i++) {
            Thread.currentThread().setName("thredulica");
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.sleep(10);
        }
    }
}
