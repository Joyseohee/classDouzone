package ex06.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinaryCopy {

	public static void main(String[] args) {
		File src = new File("C:\\Windows\\explorer.exe");	// Must has parameter.
		File dist = new File("D:\\explorerCopy.dat");	// Copy the file.
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		int c;
		
		try {
			fis = new FileInputStream(src);			// Linking the Stream with fileInputByte
			fos = new FileOutputStream(dist);		// Linking the Stream with fileOutputByte
			bis = new BufferedInputStream(fis);		// Linking the BufferedInputStream
			bos = new BufferedOutputStream(fos);	// Linking the BufferedOutputStream
			
			while((c = bis.read()) != -1) {
				bos.write((char)c);
			}
			
			System.out.println("Success");
			
			bis.close(); bos.close(); fis.close(); fos.close();
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
}
