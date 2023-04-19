package com.masai;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
// public static void main(String[] args) {
//	MultiThread counter = new MultiThread();
//	
//	IncrementThread incrementThread = new IncrementThread(counter);
//    DecrementThread decrementThread = new DecrementThread(counter);
//
//    incrementThread.start();
//    decrementThread.start();
//}
	
	 public static void main(String[] args) {
	        // Create an ExecutorService with a fixed thread pool of 3 threads
	        ExecutorService executorService = Executors.newFixedThreadPool(3);

	        // Submit tasks to the ExecutorService for execution
	        Future<?> task1 = executorService.submit(new MyTask("Task 1"));
	        Future<?> task2 = executorService.submit(new MyTask("Task 2"));
	        Future<?> task3 = executorService.submit(new MyTask("Task 3"));

	        // Shutdown the ExecutorService after all tasks are completed
	        executorService.shutdown();
	    }

	    static class MyTask implements Runnable {
	        private String name;

	        public MyTask(String name) {
	            this.name = name;
	        }

	        @Override
	        public void run() {
	            System.out.println("Executing " + name + " in " + Thread.currentThread().getName());
	            // Perform the task logic here
	        }
	    }
}
