package ex05.net.tcp;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

public class ClientTime {
	
	
	public static void main(String[] args) {
		String IP = "192.168.110.4";
		int Port = 7000;
		Date date = null;
		
		try {
			Socket s = new Socket(IP, Port);
			InputStream is = s.getInputStream();	// send message to server
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("Validate the date and the time of server...this is the client... ");
			date = (Date)ois.readObject();
			System.out.println("The time of server is \"" + date + "\".");
			ois.close();
			s.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	

}
