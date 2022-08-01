package ex06.For;

// 구구단 전체 출력하는 프로그램 작성

public class quiz2 {
	public static void main(String[] args) {

		// 삼각형
		System.out.println("Quiz 3");
		for (int i = 0; i < 5; i++) { // row 개행
			for (int j = 0; j < 5 - i; j++) { // col : print blank
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) { // col : print *
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// reverse
		System.out.println("Quiz 4");
		for (int i = 0; i < 5; i++) { // row 개행
			for (int j = 0; j < i + 1; j++) { // col : print *
				System.out.print(" ");
			}
			for (int j = 0; j < 5 - i; j++) { // col : print blank
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// square
		System.out.println("Quiz 7");
		for (int i = 0; i < 5; i++) {
			for (int l = 5 - i - 1; l > 0; l--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 5 - 1; i > 0; i--) {
			for (int l = 0; l < 5 - i; l++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

		// square
		System.out.println("Quiz 7");
		for (int i = 0; i < 5; i++) {
			for (int l = 5 - i - 1; l > 0; l--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				if (j == 0 || j == i * 2) System.out.print("*");
				else if (j < i * 2) System.out.print(" ");
//				else System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		for (int i = 5 - 1; i > 0; i--) {
			for (int l = 0; l < 5 - i; l++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				if (j == 0 || j == (i - 1) * 2) System.out.print("*");
				else if (j < (i - 1) * 2 ) System.out.print(" ");
//				else System.out.print("*");
			}
			System.out.println();
		}
		
		
/*
		// square
		System.out.println("Quiz 8");
		for (int i = 0; i < 5; i++) {
			for (int l = 0; l < 9; l++) {
				if (l < 4 - i) System.out.print(" ");
				else if (l == 4 - i) System.out.print("*");
				else if (l > 4 - i && l < ) System.out.print(" ");
				else if (l ) System.out.print("*");
			}
//			for (int j = 0; j < i * 2 + 1; j++) {
//				
//				System.out.print("*");
//			}
			System.out.println();
		}
		for (int i = 5 - 1; i > 0; i--) {
			for (int l = 0; l < 5 - i; l++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 - 1; j++) {
				if (j < i)
				System.out.print("*");
			}
			System.out.println();
		}
		//*/
	}

}
