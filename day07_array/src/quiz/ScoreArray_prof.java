
/* quiz] 성적표 프로그램 작성(배열) - 7명
 * 2차원 배열
 */

//*
package quiz;

import java.util.Scanner;

public class ScoreArray_prof {

	public static void main(String[] args) {
		
		int inwon = 3;
		Scanner sc = new Scanner(System.in);
		
		int[] kor = new int[inwon];
		int[] eng = new int[inwon];
		int[] com = new int[inwon];
		int[] total = new int[inwon];
		double[] avg = new double[inwon];
		String[] name = new String[inwon];
		char[] grade = new char[inwon];
		String[] subject = {"kor", "eng", "com"};
		
		// input
		for (int i = 0; i < 2; i++) {
			// 이름 입력 
			System.out.println("name = ");
			name[i] = sc.nextLine();
			// 과목 점수 입력
			for (int j = 0; j < subject.length; j++) {
				System.out.println(subject[j] + " = ");
				if (i== 0) kor[i] = sc.nextInt();
				else if (i== 1) eng[i] = sc.nextInt();
				else com[i] = sc.nextInt();
			}
			
			// 총점, 평균
			total[i] = kor[i] + eng[i] + com[i];
			avg[i] = (double)total[i] / inwon;
			
			// 학점
			switch((int)avg[i] / 10) {
			case 10:
				grade[i] = 'A';
				break;
			case 9:
				grade[i] = 'B';
				break;
			case 8:
				grade[i] = 'C';
				break;
			case 7:
				grade[i] = 'D';
				break;
			default:
				grade[i] = 'F';
				break;
			}
			
		} // input for end
		
		// output
		line();
		
		for (int i = 0; i < inwon; i++) {
			System.out.println(name + "님의 성적표 ********");
//			System.out.println(subject[i]);
			System.out.println("국어 : " + kor[i] + ", 영어 : " + eng[i] + ", 전산 : " + com[i]);
			System.out.printf("총점 : %d, 평균 : %.1f", total[i], avg[i]);
			System.out.println();
			line();
		}
		
	}
	public static void line() {
		System.out.println("---------------------------------");
	}
}