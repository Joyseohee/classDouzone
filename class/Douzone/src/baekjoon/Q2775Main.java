package baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class Q2775Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[][] arr = new int[15][15]; 
		
		for (int i = 0; i < arr[0].length; i++) {
			arr[0][i] = i;
		}
		
		for (int l = 0; l < T; l++) {
			int k = sc.nextInt();
			int n = sc.nextInt();
			
			for (int i = 1; i <= k; i++) {
				for (int j = 1; j <= n; j++) {
					arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
				}
			}
			
			System.out.println(arr[k][n]);
		}
	}
}

