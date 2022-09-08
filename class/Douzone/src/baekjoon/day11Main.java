package baekjoon;
import java.util.Scanner;

public class day11Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int i = 2;
		
		
		/*
		if(N != 1) {
			do {
				if(N % i == 0) {	
					N = N / i;		
					System.out.println(i);
					i = 2;
				} else {
					i++;
				}
			} while(N != 1);
		}
		*/
		
		while(N != 1) {
			if(N % i == 0) {	
				N = N / i;		
				System.out.println(i);
				i = 2;
			} else {
				i++;
			}
		}
		return;
	}
}
