	package baekjoon;

import java.util.Scanner;

public class day12Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] t = new int[123456];
		int count = 0;
		int count2 = 0;
		int count3 = 0;
		
		for (int i = 0; i < t.length; i++) {
			t[i] = sc.nextInt();
			if(t[i] == 0) break;
			count++;
		}
		/*
		for (int l = 0; l < count; l++) {
			for (int j = t[l] + 1; j <= 2 * t[l]; j++) {
				for (int k = 2; k <= Math.sqrt(j); k++) {
					if (j % k == 0) count2++;
				}
				if (count2 == 0) count3++;
				count2 = 0;
			}
			System.out.println(count3);
			count3 = 0;
		}
		//*/
		
		//*
		
		
		
		for (int l = 0; l < count; l++) {
			for (int j = t[l] + 1; j <= 2 * t[l]; j++) {
				for (int k = 2; k <= Math.sqrt(j); k++) {
					
					if (j % k == 0) {
						count2++;
						break;
					}
				}
				if (count2 == 0) count3++;
				count2 = 0;
			}
			System.out.println(count3);
			count3 = 0;
		}
		//*/
	}
}
