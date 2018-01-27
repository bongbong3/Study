package Chapter12MultiThread;

public class AutoSaveThread extends Thread {
	
	public void save() {
		System.out.println("working contents is saved.");
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
	
}
