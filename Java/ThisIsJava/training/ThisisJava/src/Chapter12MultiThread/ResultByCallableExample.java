package Chapter12MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[work execute request]");
		Callable<Integer> task = new Callable<Integer>() {
			
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i = 0; i <= 10; i++) {
					sum += i;
				}
				
				return sum;
			}
			
		};
		
		Future<Integer> future = executorService.submit(task);
		
		try {
			int sum = future.get();
			System.out.println("[process result] " + sum);
			System.out.println("[work process done]");
		} catch(Exception e) {
			System.out.println("[execute exception occur] " + e.getMessage());
		}
		
		executorService.shutdown();
		
	}
	
}
