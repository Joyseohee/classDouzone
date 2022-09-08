package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTest {

	public static void main(String[] args) {
		Socket s = null;
		
		try {
			s = new Socket("192.168.110.6", 9000);
			// IO
			InputStream is = s.getInputStream();	// read
			OutputStream os = s.getOutputStream();	// write
			
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}	// try end
	}

}
