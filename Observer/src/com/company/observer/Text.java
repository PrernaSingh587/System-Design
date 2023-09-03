package com.company.observer;

public class Text implements MainObserverInf {
    public int number;

    public Text(int number) {
        this.number = number;
    }
    @Override
    public void show() {
        System.out.println("Message sent to " + number);
    }
}
