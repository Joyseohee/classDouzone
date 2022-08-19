package ex10.file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("sample3.txt", "rw");
		
		for (int i = 0; i < 11; i++) {
			raf.seek(i*10);	// seek generate Exception
			String str = "hi";
			raf.writeUTF(str);
		}
		
		for (int i = 0; i < 11; i++) {
			raf.seek(i * 10);
			System.out.println(raf.readUTF());
		}
		
		System.out.println("Success3");
		raf.close();
	}
}
