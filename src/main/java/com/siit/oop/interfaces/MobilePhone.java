package com.siit.oop.interfaces;

import java.util.ArrayList;
import java.util.List;


public class MobilePhone implements Telephone {

    private static List<String> agenda = new ArrayList<>();

    private boolean isOn;
    //metodele statice nu pot fi abstracte

    //long
    //int
//    public Dog call(String number, int a) {
//        return new Dog();
//    }

    public static void main(String... args) {
        Telephone mobile = new MobilePhone();
//        Animal animal = t.call("");

//        long --> int

        mobile.addNumber("01281292212");
        mobile.addNumber("01281432212");
        mobile.addNumber("01281232212");
        mobile.addNumber("012812232212");
        mobile.addNumber("0761292212");

        mobile.powerOn();
        mobile.call("0761325821");
        mobile.powerOff();


        Telephone.doSomething();

        MobilePhone.doSomething();
//        mobile.doSomething(); //metodele statice definite in interfata pot fi apelate <b>doar</b> cu numele interfetei

        MobilePhone mobile2 = new MobilePhone();
        mobile2.doSomething();
    }

    public static void doSomething() {
        System.out.println("doSomething from MobilePhone");
        //in acest caz facem hiding si nu overriding
        // la method hiding se va executa intotdeauna vairianta metodei specifica clasei cu care a fost invocata
    }

    @Override
    public void call(String number) {
        if (!isOn) {
            System.out.println("Phone is off, please power it on!");
        } else if (agenda.contains(number)) {
            System.out.println("Calling  " + number);
        } else {
            dial(number);
            System.out.println("Calling  " + number);
        }
    }

    @Override
    public void dial(String number) {
        System.out.println("Dialing  " + number);
    }

    @Override
    public void ring() {
        System.out.println("Phone is ringing");
    }

    @Override
    public void sendMessage(String message, String number) {
        if (!isOn) {
            System.out.println("Phone is off, please power it on!");
        } else if (agenda.contains(number)) {
            System.out.println("Sending message " + message + " to " + number);
        } else {
            dial(number);
            System.out.println("Sending message " + message + " to " + number);
        }
    }

    @Override
    public void powerOff() {
        isOn = false;
    }

    @Override
    public boolean addNumber(String number) {
        return agenda.add(number);
    }

    @Override
    public void powerOn() {
        isOn = true;
    }
}
