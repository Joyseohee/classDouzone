package baekjoon;

import java.util.Scanner;

public class Main {
	static int M, N, sum, count, primeIndex;
	static int[] prime;

	public static void main(String[] args) {

		// @input
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();

		// @create array prime
		prime = new int[N - M + 1];

		for (int i = M; i <= N; i++) { // i = M ~ N
			for (int j = 2; j < i; j++) { // j = 2 ~ i
				if (i % j == 0)
					count++; 			// 무언가로 나눠지면 count++
			}
			if (count == 0) { 			// 소수 걸러서 배열에 저장하고 sum 구하기
				prime[primeIndex] = i;
				primeIndex++;
				sum += i;
			}
			count = 0;
		} // i ++

		// @print
		if (sum == 0) { 					// 소수가 없다면 sum도 없으므로 -1 출력
			System.out.println(-1);
		} else if (M == 1 && N != 1) {
			System.out.println(sum - 1); 	// 1은 소수가 아니므로 1을 제외하고 출력
			System.out.println(prime[1]);
		} else if (M == 1 && N == 1) {
			System.out.println(-1); 		// 1과 1 사이에 소수가 존재할 수 없으므로 -1 출력
		} else {
			System.out.println(sum);
			System.out.println(prime[0]); 	// 가장 작은 수는 0번 인덱스에 저장되므로 출력
		}
	}
}
