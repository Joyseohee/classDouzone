package ex06.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class FileCopy {
	public static void main(String[] args) throws Exception {	// 예외 처리 위임
		// Read Object : FileInputStream
		InputStream is = new FileInputStream("C:\\Users\\KOSA\\Downloads\\kiki.jpg");	// AbsolutePath
		// Write Object : FileOutputStream
		OutputStream os = new FileOutputStream("copy2.jpg");	// CanonicalPath
		
		/*
		// @ Copy each Data
		// Timer setting
		long start = System.currentTimeMillis();	// Set the Start Time
		
		while(true) {	
			int inputData = is.read();	// Read a Data
			if(inputData == -1) break;
			os.write(inputData);		// Write a Data
		}
		
		long end = System.currentTimeMillis();	// Set the Start Time
		System.out.println(end-start);
		//*/
		
		
		// @ Copy the array
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
		System.out.println("copy success!");
	}
}
