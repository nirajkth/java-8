package com.java8.methodreference;

public class MethodReference3 {
    public static void threadStatus() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(MethodReference3::threadStatus);
        thread.start();
    }
}
