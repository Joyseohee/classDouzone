package ex04.sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		System.out.println("* 정렬 전");
		int[] a = { 7, 3, 5, 2, 8 };

		// print
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// sort
		System.out.println("\n* 오름차순");
		Arrays.sort(a); // Sorting the array
		// print
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		// print array reversely
		System.out.println("\n* 내림차순");
		// print
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}

	}
}
