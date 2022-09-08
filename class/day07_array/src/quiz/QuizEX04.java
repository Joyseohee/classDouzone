
/* 문제4] 3행 4열 
 * 1행 : {3, 10, 2, 8} 
 * 2행 : {7, 15, 5, 3}
 * 3행 : {결과가 입력되도록}
 * 
 */


package quiz;

import java.util.Scanner;

public class QuizEX04 {
	public static void main(String[] args) {
		int[][] a = {{3, 10, 2, 8}, {7, 15, 5, 3}, {0, 0, 0, 0}};

		for (int i = 0; i < a[0].length; i++) {
			a[2][i] = a[0][i] + a[1][i];
			System.out.println("a[2][" + i + "] = " + a[2][i]);
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