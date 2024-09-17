package com.java8.methodreference.instance;

interface Sayable {
    void say();
}

public class InstanceMethodReference {
    public void saySomething() {
        System.out.println("Hello, this is non-static method.");
    }

    public static void main(String[] args) {
        InstanceMethodReference reference = new InstanceMethodReference();
        Sayable sayable = reference::saySomething;
        sayable.say();
    }
}
