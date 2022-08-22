package baekjoon;

import java.util.Scanner;
import java.util.TreeMap;

public class Q15649Main {
	static int N, M;
	static int[] arr;
	static boolean[] check;

	public static void main(String[] args) {
		// input
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열(1 ≤ M ≤ N ≤ 8)
		check = new boolean[N];
		arr = new int[M];

		// output
		print(0);
	}
	
	private static void print(int n) {
		if (n == M) {
			for (int i = 0; i < M; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[n] = i + 1;
				print(n + 1);
				check[i] = false;
			}
		}
	}

	// factorial method
	public static int fac(int N) {
		if(N <= 1) return N;
		return N *= fac(N-1);
	}
	
	// combination method
	public static int com(int N, int M) {
		if((N - M) == 0) return fac(N);
		return fac(N)/fac(N - M);
	}
	
	public static void print1(int M) {
		for (int i = 0; i < M; i++) {
			System.out.print(i + " ");
		}
	}
}
