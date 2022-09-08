package ex05.For;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++ ) {
//			System.out.print(i + "\t");
//		}

		// quiz 5*

//		for(int i = 0; i < 5; i++)	 {
//			System.out.print("*");
//		}
/*
		// quiz 원하는 단 입력받아서 구구단 출력하기
		System.out.println("구구단 중 몇단?");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x > 0 && x < 10) {

			for (int i = 1; i < 10; i++) {
				int y = x * i;
				System.out.println(x + " * " + i + " = " + y);
			}
		} else {
			System.out.println("1에서 9까지 수를 입력하세요");
			return;
		}
		//*/
		
		// 문제3] 1~100까지 중 3의 배수의 개수와 합을 구하는 프로그램
		
		int x = 0;
		int c = 0;
		
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0)  {
				c ++ ;			// c = c + 1;과 같다
				x += i ;
			}
		}
		System.out.println("3의 배수는 " + c + "개이고" + " 이들의 총 합은 " + x + "입니다.");
	}
}

















