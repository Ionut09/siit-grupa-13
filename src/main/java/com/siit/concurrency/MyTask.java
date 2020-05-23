package com.siit.concurrency;

import lombok.SneakyThrows;

public class MyTask implements Runnable{

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            Thread.currentThread().setName("Vasilica");
            System.out.println(Thread.currentThread().getName() + ": " + i);
            Thread.sleep(10);
        }
    }
}
