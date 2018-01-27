package Chapter12MultiThread;

public class YieldExample {

	public static void main(String[] args) {
		ThreadAYield threadA = new ThreadAYield();
		ThreadBYield threadB = new ThreadBYield();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		
		threadA.work = false;
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		
		threadA.work = true;
		
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			
		}
		
		threadA.stop = true;
		threadB.stop = true;
		
	}
	
}
