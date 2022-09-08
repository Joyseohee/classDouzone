package ex02.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
	public static void main(String[] args) throws UnknownHostException {
		String host = "192.168.110.25";
		
		InetAddress[] address = InetAddress.getAllByName(host);
		for (InetAddress item : address) {
			System.out.println(item.getCanonicalHostName());
		}
	}
}
