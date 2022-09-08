package ex02.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameEx2 {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress address = InetAddress.getLocalHost();	// occured exception
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 ip address : " + address.getHostAddress());
		
		address = InetAddress.getByName("www.sw.or.kr");
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 ip address : " + address.getHostAddress());
		
		byte[] addr = new byte[4];	// 192.168.110.25
		addr[0] = (byte)192;
		addr[1] = (byte)168;
		addr[2] = (byte)110;
		addr[3] = (byte)25;
		
		address = InetAddress.getByAddress(addr);
		System.out.println("로컬 호스트 이름 : " + address.getHostName());
		System.out.println("로컬 호스트 이름 : " + address.getCanonicalHostName());
		System.out.println("로컬 호스트 ip address : " + address.getHostAddress());
		
		InetAddress[] arr = InetAddress.getAllByName("www.google.com");
		for (InetAddress item : arr) {
			System.out.println("로컬 호스트 이름 : " + item.getHostName());
			System.out.println("로컬 호스트 ip address : " + item.getHostAddress());
		}
	}

}
