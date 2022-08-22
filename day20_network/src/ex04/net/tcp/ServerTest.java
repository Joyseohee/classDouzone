package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTest {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		
		System.out.println("Server Start");
		
		try {
			ss = new ServerSocket(9000);
			s = ss.accept();	// client socket, 응답 대기
			
			//IO
			InputStream is = s.getInputStream();	// read
			OutputStream os = s.getOutputStream();	// write

			byte[] arr = new byte[100];
			is.read(arr);
			System.out.println(new String(arr));
			
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			os.write(str.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				s.close(); ss.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
