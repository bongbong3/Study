package Chapter12MultiThread;

/**
 * Thread naming and print
 * @author kfx20
 *
 */
public class ThreadNameExample {
	
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("Programming start thread name : " + mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("working thread name : " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("working thread name : " + threadB.getName());
		threadB.start();
	}
	
}
