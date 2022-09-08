package ex09.break_Continue;

import java.util.Scanner;

/* 과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
 * 과제2] (-1) + 2 + (-3) + 4 + (-5) + 6 + (-7) + ... + 10 =? 5
 * 과제3] 1/2 + 2/3 + 3/4 + ... + 9/10 = ? 7.07
 */

public class Quiz03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// ass1
		int n = sc.nextInt();
		double x = 0;
		double sum = 0;
		
		for (int i = 1; i <= n; i++) {
			x = i / (double)(i + 1); // 1/2
			sum += x;		// 1/2 +
		}
		System.out.printf("%.2f", sum);
	}
}
