package com.siit.oop.interfaces;

public class LandLinePhone implements Telephone {

    private boolean isOn;

    @Override
    public void call(String number) {

    }

    @Override
    public void dial(String number) {

    }

    @Override
    public void ring() {

    }

    @Override
    public void sendMessage(String message, String number) {

    }

    @Override
    public void powerOff() {

    }

    @Override
    public boolean addNumber(String number) {
        return false;
    }

    @Override
    public void powerOn() {
    }
}
