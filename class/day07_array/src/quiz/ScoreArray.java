
/* quiz] 성적표 프로그램 작성(배열) - 7명
 * 2차원 배열
 */

//*
package quiz;

import java.util.Scanner;

public class ScoreArray {

	public static void main(String[] args) {
		int[][] score = new int[7][7];
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			System.out.println("학번을 입력하세요");
			int name = sc.nextInt();
			score[i][0] = name;
			
			while (true) {
				do {
					System.out.println("국어 성적을 입력하세요");
					score[i][1] = sc.nextInt();
				} while (score[i][1] < 0 || score[i][1] > 100);
				break;
			}

			while (true) {
				do {
					System.out.println("영어 성적을 입력하세요");
					score[i][2] = sc.nextInt();
				} while (score[i][2] < 0 || score[i][2] > 100);
				break;
			}

			while (true) {
				do {
					System.out.println("전산 성적을 입력하세요");
					score[i][3] = sc.nextInt();
				} while (score[i][3] < 0 || score[i][3] > 100);
				break;
			}
			
			// 총점과 평균 구
			score[i][4] = score[i][1] + score[i][2] + score[i][3];
			score[i][5] = (int) (score[i][4] / 3);

			switch ((int) score[i][5] / 10) {
			case 9:
				score[i][6] = 'A';
				break;
			case 8:
				score[i][6] = 'B';
				break;
			case 7:
				score[i][6] = 'C';
				break;
			case 6:
				score[i][6] = 'D';
				break;
			default:
				score[i][6] = 'F';
				break;
			}
			// 학점 평점 구하기

			System.out.println(score[i][0] + "님의 성적표 *****");
			System.out.println("국어 : " + score[i][1] + ", 영어 : " + score[i][2] + ", 전산 : " + score[i][3]);
			System.out.printf("총점 : %d, 평균 : %d", score[i][4], score[i][5]);
			System.out.println(", 학점 : " + (char)score[i][6]);
			System.out.println();
		}
	}
}



//char name = sc.nextLine().charAt(0);
//score[num][0] = name;
//int kor = score[num][1], eng = score[num][2], com = score[num][3];
//int total = score[num][4];
//double avg = (double)(score[num][5]); 
//
//char grade = (char) score[num][6];

//System.out.println("Would you like to insert more information?");
//char yesno = sc.next().charAt(0);
//if (yesno == 'n' || yesno == 'N') break;
//*/