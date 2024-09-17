package com.java8.methodreference;

interface Sayable {
    void say();
}

public class MethodReference2 {
    public static void saySomething() {
        System.out.println("Hello, this is the static method.");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference2::saySomething;
        sayable.say();
    }
}
