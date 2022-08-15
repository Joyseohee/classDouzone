/*
package codingTest;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int AnswerN;
	static int N = 10;
	static Scanner sc = new Scanner(System.in);
	public static char[][] pan = null;
	static char key = 0;
	static int count = 0;
	static int i = 0;
	static int j = 0;
	static int a = 0;
	static int b = 0;

	public static void main(String args[]) throws Exception {
		//System.setIn(new FileInputStream("C:\sample_input.txt"));
		
		//테스트 케이스 수 입력
		int T = sc.nextInt();
		
		//바둑판의 크기 입력 및 출력
		for(int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			// 바둑판 먹는 함수 : N을 받아서 int AnswerN을 출력할 것
			AnswerN = eat(N);
			System.out.println("#"+test_case+" "+AnswerN);
		}
		
	}
	
	// @바둑판을 먹는 함수(선언)
	public static int eat(int n2) {
		
		// $바둑판을 입력하는 함수(호출)
		char[][] testpan = inputpan(n2);
		
		// 2. X찾아 key에 할당
		char key = '0';
		for (i = 0; i < testpan.length; i++) {
			for (j = 0; j < testpan.length; j++) {
				if(testpan[i][j] == 'X') {
					key = testpan[i][j];
					return testpan[i][j];
				}
			}
		}
		
		// 3. key를 배열 index를 바꾸며 이동
		//key 이동
		while() {
			go(i, j);
			if ((pan[i][j] == 'H' && pan[i][j+1] == 'H') || (pan[i][j] == 'H' && pan[i + 1][j] == 'H')) {
				change(a, b);
			}
		}
		
			
		if
		int ans = change(a, b);
		return ans;	// 먹은 바둑판의 수를 리턴
		
	}
	// @바둑판을 입력하는 함수(선언)
		public static char[][] inputpan(int N) {
			pan = new char[N][N];

			for (int i = 0; i < pan.length; i++) {
				for (int j = 0; j < pan.length; j++) {
					pan[i][j] = sc.next().charAt(0);
					System.out.print(pan[i][j]);
				}
				System.out.println();
			}
			return pan;	// 바둑판 배열을 리턴
		}
	
	// @이동하는 함수
	public static void go(int x, int y, testpan[x][y]) {
		
		for (int k = 0; k < testpan.length; k++) {	// 상하
			for (int i = 0; i < testpan[].length; i++) {	// 좌우
				// 막 다른 길일 경우 1. Y를 만나거나 2. 배열을 벗어날 경우
				if(testpan[x + k][y + i] == 'Y') {		// y 만나기
					key = testpan[x + k + 1][y + i];
					testpan[x + k][y + i] = 'L';
				} else if((x + k > testpan.length - 1) && (y + i > testpan[].length - 1)) {		// 배열 벗어나기
					if((x + k > testpan.length - 1) && (y + i <= testpan[].length - 1)) {		// 행에서 탈출
						key = testpan[testpan.length - 1][y + i + 1];
						testpan[testpan.length - 1][y + i] = 'L';
					} else if((x + k <= testpan.length - 1) && (y + i > testpan[].length - 1)) {		//열에서 탈출
						key = testpan[x + k + 1][testpan[].length - 1];
						testpan[x + k][testpan[].length - 1] = 'L';
					} else {		// 행열 모두 탈출
						key = testpan[testpan.length - 2][testpan[].length - 1];
						testpan[testpan.length - 1][testpan[].length - 1] = 'L';
					}
				} else {									//직진
					key = testpan[x + k][y + i] = 'X';
					testpan[x][y] = 'L';
				}
			}//좌우 이동 끝
		}//상하 이동 끝
		go(a, b, pan[a], [b]);
	}
	
	// @회전하는 함수
	public static void turn() {
		
	}

	// @바꾸고 카운트하는 함수
	public static int change(int i, int j) {
		pan[i][j] = 'L';
		if(pan[i][j] == 'H' && pan[i][j+1] == 'H') {
			pan[i][j+1] = 'X';
			
		} else {
			pan[i+1][j] = 'X';
		}
		count ++;
		return count;
	}
}

//*/















