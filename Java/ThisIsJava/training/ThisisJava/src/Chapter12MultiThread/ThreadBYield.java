package Chapter12MultiThread;

public class ThreadBYield extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadB work contents.");
			} else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadB exit.");
		
	}

}
