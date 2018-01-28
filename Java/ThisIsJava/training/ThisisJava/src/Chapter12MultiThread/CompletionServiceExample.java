package Chapter12MultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample extends Thread {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		
		System.out.println("[work process request]");
		
		for(int i = 0; i < 3; i++) {
			completionService.submit(new Callable<Integer>() {
				
				@Override
				public Integer call() throws Exception {
					// TODO Auto-generated method stub
					int sum = 0;
					for(int i = 0; i <= 10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}
		
		System.out.println("[process completed work confirm]");
		executorService.submit(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					try {
						Future<Integer> future = completionService.take();
						int value = future.get();
						System.out.println("[process result] " + value);
					} catch(Exception e) {
						break;
					}
				}
			}
		});
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		
		executorService.shutdownNow();
		
	}

}
