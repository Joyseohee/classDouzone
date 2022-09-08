package quiz;

import java.util.Scanner;

public class QuizEx03 {
	public static void main(String[] args) {
		int[][] a = new int[2][3];
		System.out.println("array data 2 * 3 = ");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print("a[" + i + "][" + j + "] = ");
				a[i][j] = new Scanner(System.in).nextInt();
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
