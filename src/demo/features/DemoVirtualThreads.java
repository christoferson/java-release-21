package demo.features;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class DemoVirtualThreads {

	public static void demoVirtualThreads() {

		long start = System.currentTimeMillis();
		System.out.println("Start: " +  start);
		
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
			IntStream.range(0, 10_000).forEach(i -> {
				executor.submit(() -> {
					Thread.sleep(Duration.ofSeconds(1));
					return i;
				});
			});
		}
		
		long end = System.currentTimeMillis();
		System.out.println("End: " +  end + " " + (end-start));

	}
}
