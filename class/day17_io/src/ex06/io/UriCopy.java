package ex06.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UriCopy {
	public static void main(String[] args) throws MalformedURLException, Exception, IOException {
		URL url = new URL("https://i.pinimg.com/564x/c2/d9/32/c2d9321ba76db149808d0d87faad65c3.jpg");	// Must declare Exception
		// 읽기 객체
		InputStream is = url.openStream(); 
		// 쓰기 객체
		OutputStream os = new FileOutputStream("japan.png");
		
		// copy and paste
		byte[] buffer = new byte[1024*8];
		long start = System.currentTimeMillis(); // Set the Start Time

		while (true) { // Copy each Data
			int inputData = is.read(buffer); // Read a Data
			if (inputData == -1)
				break;
			os.write(buffer, 0, inputData);; // Write a Data
		}

		long end = System.currentTimeMillis(); // Set the Start Time
		System.out.println(end - start);
		
		is.close();
		os.close();
		System.out.println("copy success from web!");
		
	}

}
