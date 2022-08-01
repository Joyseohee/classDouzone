package ex07.While;

public class Quiz_dowhile {
	public static void main(String[] args) {
		
		
		// 이중 do-while
		int a = 1, b = 1;
		do {															// 1번 do-while문
			do {														// 2번 do-while문
				System.out.print(b + " * " + a + " = " + a * b + "\t");	// 2번 do-while문 실행구문
				b++;													// 2번 do-while문 증감식
			} while (b <= 9 );											// 2번 do-while문 조건식
			System.out.println();										// 1번 do-while문 실행구문
			b = 1;		// 초기화 다시 해주지 않으면 빠져나가도 초기화되지 않는다(difference with for-loop)
																		// 초기화해줘야 1번 do-while문 제대로 실행
			a++;														// 1번 do-while문 증감식
		} while (a <= 9);												// 1번 do-while문 조건식
	}
}



