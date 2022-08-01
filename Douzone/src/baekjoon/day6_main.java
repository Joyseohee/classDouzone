package baekjoon;

import java.util.Scanner;

public class day6_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();					// 입력

		int count = 0;

		int y1 = 0;
		int y2 = 0;
		int y3 = 0;

		int tmp = N;							// tmp에 N을 저장해 N값 기
		do {
			y1 = tmp % 10;						// y1 = 일의 자리수
			y2 = tmp / 10 % 10;					// y2 = 십의 자리수
			y3 = y1 * 10 + ((y2 + y1) % 10);	// y3 = 새로운 수
			count++;							// count = 사이클 길이
			tmp = y3;							// y3를 tmp에 넣어 저장후 반복
		} while (y3 != N);					// 새로운 수 y3가 처음 입력한 N과 같아지면 종 
		System.out.println(count);				// 출력
	}

}
