package com.masai;

public class MultiThread {

	private int value = 0;

    public synchronized void increment() {
        value++;
        System.out.println("Incremented counter: " + value);
    }

    public synchronized void decrement() {
        value--;
        System.out.println("Decremented counter: " + value);
    }

}
