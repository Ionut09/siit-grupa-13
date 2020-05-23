package com.siit.concurrency;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsExample {

    public static void main(String... args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();//similar cu java.util.stream.Collectors

        Future<String> futureResult = threadPool.submit(() -> {
            //do some processing
            Thread.sleep(5000);
            System.out.println("process in: " + Thread.currentThread().getName());
            return "result of processing";
        });

        System.out.println(LocalDateTime.now());
        String result = futureResult.get(); //aici threadul main asteapta ca taskul submis sa se termine
        System.out.println("result after" + LocalDateTime.now() + " = " + result);
        threadPool.shutdown();
    }
}
