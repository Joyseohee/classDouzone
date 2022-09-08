package codingTest;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution2 {
	static int AnswerN;
	static int N = 10;
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		
		//*
		//바둑판의 크기 입력 및 출력
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			// 바둑판 먹는 함수 : N을 받아서 int AnswerN을 출력할 것
			AnswerN = eat(N);
//			eat(N);
			System.out.println("#"+test_case+" "+AnswerN);
		}
		
		//*/
	}
	
	// @바둑판을 먹는 함수(선언)
	public static int eat(int n2) {
		
		// $바둑판을 입력하는 함수(호출)
		char[][] testpan = inputpan(n2);
		return 0;	// 먹은 바둑판의 수를 리턴
		
	}

	// @바둑판을 입력하는 함수(선언)
	private static char[][] inputpan(int n2) {
		char[][] pan = new char[n2][n2];

		for (int i = 0; i < pan.length; i++) {
			for (int j = 0; j < pan.length; j++) {
				pan[i][j] = sc.next().charAt(0);
//				System.out.print(pan[i][j]);
			}
//			System.out.println();
		}
		return pan;	// 바둑판 배열을 리턴
	}
}

















