package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
//		System.out.print("input = "); String str1 = br.readLine();
//		System.out.print("input = "); String str2 = br.readLine();
		
		System.out.print("input = ");
		int su1 = Integer.parseInt(br.readLine());	// 한번에 처리
		
		System.out.print("input = ");
		int su2 = Integer.parseInt(br.readLine());
		
		System.out.println(su1 + ", " + su2);
		System.out.println(su1 + su2);
	}
}
