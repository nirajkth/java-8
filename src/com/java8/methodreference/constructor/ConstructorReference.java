package com.java8.methodreference.constructor;

interface Messable {
    Message getMessage(String msg);
}

class Message {
    String msg;

    public Message(String msg) {
        this.msg = msg;
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Messable messable = Message::new;
        System.out.println(messable.getMessage("Hello").msg);
    }
}
