package ex09.break_Continue;

import java.util.Scanner;

/* 과제1] 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + (1 + 2 + 3 + 4 + 5) = ? 35
 * 과제2] (-1) + 2 + (-3) + 4 + (-5) + 6 + (-7) + ... + 10 =? 5
 * 과제3] 1/2 + 2/3 + 3.4 + ... + 9/10 = ? 7.07
 */

public class Quiz01 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// ass1
		int n = sc.nextInt();
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				sum2 += j;
			}
			sum1 += sum2;
		}
		System.out.println(sum2);
		
		
	}

}
