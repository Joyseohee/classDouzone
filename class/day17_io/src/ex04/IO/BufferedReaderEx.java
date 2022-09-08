package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {	// 예외 위임 - 
		/*
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);	// must have the parameter : reader
		
		System.out.println("charactor input = ");
		String str = br.readLine();
		
		System.out.println(str);
		//*/

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	// 윗단 합친 것
		System.out.println("charactor input = ");
		String str = br.readLine();
		
		System.out.println(str);
		
	}
}
