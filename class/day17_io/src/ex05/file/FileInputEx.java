package ex05.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileInputEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
//			OutputStream os = new FileOutputStream("memo.txt");	// 상대 경로 
			OutputStream os = new FileOutputStream("D:\\SeoheePark\\home.selection\\DouZone_th3\\1_Java\\문서자료\\java00_객체지향.pdf");	// 절대 경로 (\\ = /)
			
			while(true) {
				System.out.println("문자열 입력 요망 : ");
				String str = sc.nextLine() + "\r\n";
				
//				if(str.toUpperCase().equals("EXIT\r\n")) break;	// 밑에와 같다.
				if(str.equalsIgnoreCase("EXIT\r\n")) {
					System.out.println(str.length() + "byte만큼 썼습니다.");
					break;
				}
					os.write(str.getBytes());	// 예외 처리, 읽어들인 문자 str의 길이만큼(getBytes()) 써주세요.
			} // end while
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
