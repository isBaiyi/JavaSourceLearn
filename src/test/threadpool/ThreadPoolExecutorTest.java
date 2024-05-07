package test.threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @description: 线程池测试
 * @author: star bright
 * @date: 2024/5/7 19:30
 */
public class ThreadPoolExecutorTest {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(1,
				2,
				10,
				TimeUnit.SECONDS,
				new LinkedBlockingQueue<>(2));

		executor.execute(() -> {
			System.out.println("111");
			try {
				Thread.sleep(10000000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		executor.execute(() -> {
			System.out.println("222");
			try {
				Thread.sleep(10000000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		executor.execute(() -> {
			System.out.println("333");
			try {
				Thread.sleep(10000000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		executor.execute(() -> {
			System.out.println("444");
			try {
				Thread.sleep(10000000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});

		executor.execute(() -> {
			System.out.println("555");
			try {
				Thread.sleep(10000000);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		});
	}
}
