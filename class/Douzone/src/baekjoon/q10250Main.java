package baekjoon;

import java.util.Scanner;

public class q10250Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
	
		for (int i = 0; i < T; i++) {
			int H = sc.nextInt();	// 층
			int W = sc.nextInt();	// 방
			int N = sc.nextInt();	// 몇번째 손님
			
			if (N%H == 0) System.out.println(H * 100 + N/H); 
			else System.out.println(N%H * 100 + N/H+1);
		}
	}
}

//10
//30 12 350