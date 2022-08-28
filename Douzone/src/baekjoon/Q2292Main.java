package baekjoon;

import java.util.Scanner;

//*


class Q2292Main {
	
	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();
		N --;
		
		int dis = 1;	// 1로부터의 거리 default값은 1
		
		while(N > 0) {	// 더 이상 뺄 게 없으면 distance 반환
			N = N - 6 * dis;	// N - 1한 수에 계차수열 거꾸로 구현
			dis++;	// 계층 늘리기
		}
		System.out.print(dis);
	}
}

