package baekjoon;
/*
import java.util.Scanner;

public class Q2839Main {
	
	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();

		if (N == 4 || N == 7)
			System.out.println(-1);
		else if (N == 3)
			System.out.println(1);
		else {
			int n = N % 5;
			switch (n) {
			case 0:
				System.out.println(N / 5);
				break;
			case 1:
			case 3:
				System.out.println(N / 5 + 1);
				break;
			case 2:
			case 4:
				System.out.println(N / 5 + 2);
			}
		}
	}
}
//*/
//*
import java.util.*;

class Q2839Main {
	public static void main(String[] V) {
		Scanner S = new Scanner(System.in);
		int N = S.nextInt(), T = 0, F = N / 5;
		
		while (F >= 0) {
			if ((N - 5 * F) % 3 == 0) {
				T = (N - 5 * F) / 3;
				break;
			}
			F--;
		}
		System.out.print(T + F);
	}
}

//*/
