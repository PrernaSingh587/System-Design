package com.company.observer;

public class Email implements MainObserverInf{

    String email;
    public Email(String email) {
        this.email = email;
    }
    @Override
    public void show() {
        System.out.println("Message sent to " + email);

    }
}
