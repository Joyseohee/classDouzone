package baekjoon;

import java.util.Scanner;

public class day15Main {
	public static int i = 1;
	public static int N = new Scanner(System.in).nextInt();
	public static int M = 1;

	public static void main(String[] args) {
		factorial();
		System.out.println(M);
	}

	public static void factorial() {
		if (i > N) return;
		M = M * i;
		i++;
		factorial();
	}
}
