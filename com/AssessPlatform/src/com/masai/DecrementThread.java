package com.masai;

public class DecrementThread extends Thread{
	private MultiThread counter;

    public DecrementThread(MultiThread counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            counter.decrement();
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}
}
