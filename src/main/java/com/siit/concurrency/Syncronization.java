package com.siit.concurrency;

public class Syncronization {

    public synchronized void syncronizedMethod() {
        //kdimosandso

    }

    public void methodWithSyncronizedBlock() {
        //kdimosandso
        Object o = new Object();
        synchronized (o) {
            //do something synchronized
        }

        synchronized (this) {
            //do something synchronized
        }

    }

    public void methodWithSyncronizedBlockPerCallingObject() {
        synchronized (this) {
            //do something synchronized
            System.out.println("methodWithSyncronizedBlockPerCallingObject" + Thread.currentThread().getName());
            System.out.println("methodWithSyncronizedBlockPerCallingObject" + Thread.currentThread().getName());
            System.out.println("methodWithSyncronizedBlockPerCallingObject" + Thread.currentThread().getName());
            System.out.println("methodWithSyncronizedBlockPerCallingObject" + Thread.currentThread().getName());
        }
    }

    public synchronized void syncronizedMethodPerCallingObject() {
        //do something synchronized
        System.out.println("syncronizedMethodPerCallingObject");
    }

    public static void main(String... args) {
        Syncronization callingObj = new Syncronization();

        Thread t1 = new Thread(callingObj::methodWithSyncronizedBlockPerCallingObject);
        Thread t2 = new Thread(callingObj::methodWithSyncronizedBlockPerCallingObject);

        Thread t3 = new Thread(callingObj::syncronizedMethodPerCallingObject);
        Thread t4 = new Thread(callingObj::syncronizedMethodPerCallingObject);

        t1.start();
        t2.start();
//        t3.start();
//        t4.start();

    }
}

