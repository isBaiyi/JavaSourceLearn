package test.threadlocal;

import java.math.BigDecimal;

/**
 * @description: ThreadLocal测试
 * @author: star bright
 * @date: 2024/5/8 10:28
 */
public class ThreadLocalTest {
	// ThreadLocal variable to store each thread's ID
	// private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> (int) (Math.random() * 1000));
	private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> 100);

	public static void main(String[] args) {
		// Create multiple threads
		Thread thread1 = new Thread(new Task(), "Thread-1");
		Thread thread2 = new Thread(new Task(), "Thread-2");
		Thread thread3 = new Thread(new Task(), "Thread-3");

		// Start the threads
		thread1.start();
		thread2.start();
		thread3.start();

		int i = new BigDecimal("0.9").compareTo(new BigDecimal("1"));
		System.out.println("i = " + i);
	}


	// Task to be executed by each thread
	static class Task implements Runnable {
		@Override
		public void run() {
			// Get the thread's unique ID
			Integer id = threadId.get();
			System.out.println(Thread.currentThread().getName() + " has ID: " + id);

			// Do some work
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + " working with ID: " + id);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			// Remove the thread-local variable
			threadId.remove();

			System.out.println(Thread.currentThread().getName() +" call remove() then call get() = " + threadId.get());
		}
	}
}
