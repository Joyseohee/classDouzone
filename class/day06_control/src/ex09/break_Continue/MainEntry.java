package ex09.break_Continue;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		//*
		for (int i = 0; i < 10; i++) {
			if ( i == 7 ) break;
			System.out.println(i + 1);
		}
		
		System.out.println("=======");
		for (int i = 0; i < 10; i++) {
			if ( i == 6 ) continue;			// 증감식으로 돌아가서 7은 스킵하게 된다.
			System.out.println(i + 1);
		}
		
		System.out.println("=======");
		for (int i = 0; i < 100; i++) {
			if (i % 10 == 0 && i / 10 != 0) System.out.println();
			if ((i+1) % 2 == 1 ) continue;			// 증감식으로 돌아가서 홀수는 스킵하게 된다.
			System.out.print(i + 1 + " ");
		}
		//*/
		
		
		/*
		
		System.out.println("점수(1~100만 입력) = ");
		
		int su;
		while (true) {
			do {
				su = new Scanner(System.in).nextInt();
				System.out.println(su);
			} while (su >= 0 && su <= 100);

			System.out.println("다시 입력?");
			char yesno = new Scanner(System.in).next().charAt(0);
			if (yesno == 'n' || yesno == 'N')
				break;		//escape while
		}
		//*/
	}

}
