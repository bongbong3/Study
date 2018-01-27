package Chapter12MultiThread;

public class ThreadAYield extends Thread {
	
	public boolean stop = false;
	public boolean work = true;
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA work contents.");
			} else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadA exit.");
		
	}

}
