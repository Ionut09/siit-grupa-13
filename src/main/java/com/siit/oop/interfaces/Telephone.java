package com.siit.oop.interfaces;

/**
 * Nu poate avea constructor
 */
public interface Telephone {

    //by default un field va fi public final static
    //toate declaratiile de mai jos sunt echivalente
    public final static String OS = "Android";
    final static String OS1 = "Android";
    public static String OS2 = "Android";
    String OS3 = "Android";

    boolean addNumber(String number);

    void call(String number);

    void dial(String number);

//    public abstract void sendMessage(String message);

    void powerOff();

    //by default o metoda va fi public abstract
//    void powerOn();

    public default void powerOn() { //by default e public
        System.out.println("power on ");
        doSomethingPrivate();
    }

    public static void doSomething() {//by default e public
        System.out.println("doSomething() from Telephone");
    }

    void ring();

    void sendMessage(String message, String number);

    private void doSomethingPrivate() {
        System.out.println("bla");
    } //JCP
}
