package Chapter12MultiThread;

public class JoinExample {
	
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch(InterruptedException e) {
			
		}
		
		System.out.println("1 ~ 100 sum : " + sumThread.getSum());
	}

}
