
/* 문제4] 3행 4열 
 * 1행 : {3, 10, 2, 8} 
 * 2행 : {7, 15, 5, 3}
 * 3행 : {결과가 입력되도록}
 * 
 */

package quiz;

import java.util.Scanner;

public class QuizEX04_02 {
	public static void main(String[] args) {
		int[][] a = new int[3][4];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == 2) {
					a[2][j] = a[0][j] + a[1][j];
					System.out.print(a[2][j] + " ");
				} else a[i][j] = sc.nextInt();
			}
		}
	}
}

//
//for(int i = 0; i < a.length; i++) {
//	for (int j = 0; j < a[0].length; j++) {
//		a[i][j] = new Scanner(System.in).nextInt();
//	 
//	}
//}
//