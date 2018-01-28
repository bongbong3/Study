package Chapter18IO;

import java.io.FileInputStream;

public class FileInputStreamExample {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\kfx20\\Study\\Java\\ThisIsJava\\training\\ThisisJava\\src\\Chapter12MultiThread\\AutoSaveThread.java"
					);
			
			int data;
			while( (data = fis.read()) != -1 ) {
				System.out.write(data);
			}
			fis.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
