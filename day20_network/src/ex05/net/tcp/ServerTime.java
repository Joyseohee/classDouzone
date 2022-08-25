package ex05.net.tcp;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServerTime {

	
	
	public static void main(String[] args) {
		int Port = 7000;
		try {
			System.out.println("server start*****");
			ServerSocket ss = new ServerSocket(Port);	// @socket1
			
			while (true) {
				Socket s = ss.accept();	//wait till the client message is came.
				
				OutputStream os = s.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				
				oos.writeObject(new Date());
				oos.flush();
				s.close();	// the client socket is closed.(server one never closed)
//				ss.close(); // if unlocked the this, the server socket is closed.
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
