package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;
		
		try {
			System.out.println("단일 문자 입력 : ");
//			int num = is.read();
			int num = is.read() - '0';	// 0만큼 빼면 숫자 그대로 출력
			
			is.read(); is.read();	// 문제 발생 처리 - 자바에서는 문자가 2바이트 처리된다.
			
			int num2 = is.read() - '0';
			
			
//			System.out.println((char)num);
			System.out.println(num - num2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
