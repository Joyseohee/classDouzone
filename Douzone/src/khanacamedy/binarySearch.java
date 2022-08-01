package khanacamedy;

import java.util.Scanner;

public class binarySearch {
	public static void main(String[] args) {
		int[] array = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 
				47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		int min = 0;
		int max = array[array.length - 1];
		int target = 67;
		int result = 0;
		
		Scanner sc = new Scanner(System.in);
		int guess = sc.nextInt();
		
		
		if (max < min) {
			System.out.println("target isn`t in array");
		} else {
			while (max >= min) {
				if (guess < target) min = guess + 1;
				else max = guess - 1;
				
			}
		}
		
		
		System.out.printf("67을 찾았습니다. 67보다 작은 수는 %d개 입니다.\n", result);
	}
}
