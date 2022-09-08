package ex07.While;

import java.util.Scanner;

public class MainEntry {
		public static void main(String[] args) {
			
			/*
			for (int i = 0; i < 10; i++) {
				System.out.println(i + 1);
			}
			System.out.println("while ------");
			
			int i = 0 ;
			while(i < 10) {	// 조건식
				System.out.println(i + 1);
				i++;
			}
			
			
			System.out.println("do while ------");
			
			i = 0;
			do {
				System.out.println(i + 1);
				i++;
			} while (i < 10);
			//*/
			
			
			System.out.println("몇 단?");
			int dan = new Scanner(System.in).nextInt();
			
			/*
			//while, 원하는 단 출력
			int i = 1;
			while(i < 10) {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				i ++;
			}
			//*/
			
			//do-while
			//아래 두 식 같다
			
			int i = 1;
			do {
				System.out.println(dan + " * " + i + " = " + (dan * i));
			} while(i ++ < 10);
			
			System.out.println();
			

			i = 1;
			do {
				System.out.println(dan + " * " + i + " = " + (dan * i));
				i ++ ;
			} while(i < 10);
			
		}
		
		
		

}
