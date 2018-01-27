package Chapter12MultiThread;

public class PrintThread2 extends Thread {
	
	public void run() {
		while(true) {
			System.out.println("executing.");
			if(Thread.interrupted()) {
				break;
			}
		}
		
		System.out.println("resource arrangement.");
		System.out.println("execution exit.");
		
	}

}
 