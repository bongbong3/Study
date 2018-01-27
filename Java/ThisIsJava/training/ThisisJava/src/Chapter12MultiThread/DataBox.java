package Chapter12MultiThread;

public class DataBox {
	
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
		
		String returnValue = data;
		System.out.println("ConsumerThread read data : " + returnValue);
		data = null;
		notify();
		return returnValue;
		
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {
				wait();
			} catch(InterruptedException e) {
				
			}
		}
		
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터 : " + data);
		notify();
	}

}
