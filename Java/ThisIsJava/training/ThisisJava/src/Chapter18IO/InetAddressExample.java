package Chapter18IO;

import java.net.InetAddress;

public class InetAddressExample {
	
	public static void main(String[] args) {
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("My computer IP address : " + local.getHostAddress());
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP¡÷º“ : " + remote.getHostAddress());
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
