package com.java8.methodreference.instance;

public class InstanceMethodReference2 {
    public void printMsg() {
        System.out.println("Hello, this is instance method");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMethodReference2()::printMsg);
        thread.start();
    }
}
