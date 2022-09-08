
/*
package ex01.array;

public class ArrayEx2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		} 
		System.out.println(sum);
	}
}
//*/
//*
package ex01.array;

import java.util.Scanner;

// use Scanner and calculate sum.
public class ArrayEx2 {
	public static void main(String[] args) {
		System.out.println("input length of array = ");
		int n = new Scanner(System.in).nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("input " + n + " data = ");
		
		for (int i = 0; i < n; i++) {
			arr[i] = new Scanner(System.in).nextInt();
			sum += arr[i];
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			if (i == n - 1) System.out.print(arr[i]);
			else System.out.print(arr[i] + " + ");
			 
		}
		System.out.print(" = " + sum);
		System.out.println();
		System.out.println();
		System.out.println("sum = " + sum);
	}
}
//*/







