
package ex05.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {

	public static void main(String[] args) throws IOException {
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// from keybord.
		ps.print("접속할 서버 ip ===> ");
		ip = br.readLine();
		ps.print("전송할 메시지 ===>");
		str = br.readLine();
		
		byte[] buffer = str.getBytes("euc-kr");	// match with server
		String message = new String(buffer, "euc-kr");
		
		Socket client = new Socket(ip, port);	//server ip and port number create socket
		OutputStream os = client.getOutputStream();	//write ip through the network
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(message, 0, message.length());
		bw.flush();
		
		bw.close();
		client.close();
		ps.print(ip + "에 메시지 전송 성공~~~~");
		ps.close();
		
	}

}