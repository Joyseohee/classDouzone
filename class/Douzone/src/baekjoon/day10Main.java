package baekjoon;

import java.util.Scanner;

/* 문제
자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최솟값은 61이 된다.

* 입력
입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

* 출력
M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최솟값을 출력한다. 
단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
 */


public class day10Main {
	static int M, N, sum, count, primeIndex;
	static int[] prime;
	
	public static void main(String[] args) {
		
		// input
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		
		// m==1 && n!=1 -> sum-1
		// m==1 && n==1 -> sysout -1
		
		
		// create array prime
		prime = new int[N - M + 1];

		for (int i = M; i <= N; i++) {			// i = M ~ N
			for (int j = 2; j < i; j++) { 		// j = 2 ~ i
				if(i % j == 0) count++;		// M부터 N까지의 어떤 수 i에게 1과 자기 자신이 아닌 다른 수로 나눌 수 있는 j가 있다면 카운  
			}
			if (count == 0) {					// 소수 걸러서 배열에 저장하고 su 구하기
					prime[primeIndex] = i;	
					primeIndex++;
					sum += i;
			}
			count = 0;
		} // i ++

		// print
		if(sum == 0) {							// 소수가 없다면 sum도 없으므로 -1 출력
			System.out.println(-1);
		} else if(M == 1 && N != 1){			
			System.out.println(sum - 1);		// 1은 소수가 아니므로 1을 제외하고 출력
			System.out.println(prime[1]);		
		} else if(M == 1 && N == 1){
			System.out.println(-1);				// 1과 1 사이에 소수가 존재할 수 없으므로 -1 출력
		} else {
			System.out.println(sum);
			System.out.println(prime[0]);		// 가장 작은 수는 0번 인덱스에 저장되므로 출력
		}
		
	}
	
	
	/*
	private static int FindMinValue(int array[], int primeIndex) {
		minIndex = 0;
		for (int i = 0; i < primeIndex; i++) {
			for (int j = 0; j < primeIndex; j++) {
				if(prime[j] < prime[i]) minIndex = j;
			}
		}
		minValue = prime[minIndex];
		return minValue;
	}
	
	private static void output(int sum, int minValue) {
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(minValue);
		}
	}
	//*/
}
