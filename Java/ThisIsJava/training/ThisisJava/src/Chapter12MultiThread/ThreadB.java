package Chapter12MultiThread;

public class ThreadB extends Thread {
	
	public void run() {
		for(int i = 0; i < 2; i++) {
			System.out.println(getName() + " is printing contents.");
		}
	}

}
