package baekjoon;

import java.util.Scanner;

public class day5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			for (int l = N - i - 1; l > 0 ; l --) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = N - 1; i > 0; i--) {
			for (int l = 0; l < N - i ; l ++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

//for (int j = 0; j < N; j = 2 * j + 1) {
//	System.out.print("*");
//	System.out.println();
//}