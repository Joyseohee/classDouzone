package baekjoon;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q11729Main {
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static Scanner sc = new Scanner(System.in);
	public static int N = sc.nextInt();	// 장대에 쌓인 원판의 개
	
	public static int K = 0;	// 옮긴 횟수

	public static void main(String[] args) throws IOException {
		//output
		System.out.println((int)Math.pow(2, N) - 1);
			
		Hanoi(N, 1, 2, 3);
		bw.close();

	}
//	
//	static int x = 2;
//	private static int rec(int i) {
//		if(i <= 1) return x;
//		x = 2 * rec(i - 1);
//		return x;
//	}
	
	public static void Hanoi(int N, int start, int mid, int to) throws IOException {
		 
		if (N > 0) {
	 
		Hanoi(N - 1, start, to, mid);
	    
		bw.write(start + " " + to);
	    
		Hanoi(N - 1, mid, start, to);
		}
	}

}
