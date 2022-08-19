package ex07.IO;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataInputStreamEx {

	public static void main(String[] args) throws Exception {
		File file = new File("test.txt");
		FileOutputStream fos = new FileOutputStream(file);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeBoolean(true);
		dos.writeChar(65);	// ASCII code ---> 'A'
		dos.writeShort(100);
		dos.writeInt(5000000);
		dos.writeLong(1234567890987456321l);
		dos.writeFloat(12345678987654321.3216548f);
		dos.writeDouble(12345678987654321.321654801345678956);
		dos.flush(); // buffer 비우기 
		
		System.out.println("text.txt 파일에 " + dos.size());
	}

}
