package Chapter12MultiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		
		System.out.println("[work process request]");
		
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				int sum = 0;
				for(int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("[execute result]" + sum);
			}
		};
		
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("[work process done]");			
		} catch(Exception e) {
			System.out.println("[execute exception occur] " + e.getMessage());
		}
		
		executorService.shutdown();
		
	}
	
}
