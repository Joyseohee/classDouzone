package quiz;

import java.util.Scanner;

/*
문제5] 성적처리 프로그램 함수로 분할(분리)할것
입력 함수 input()  - 이름 , 국어, 영어,전산 점수 
총점 함수 total(~~~) - 총점 구하는 함수
평균 함수 average( ~~ ) - 평균 구하는 함수
평점(학점) grade( ~~ ) - 학점 구하는 함수 
출력 함수 output( ) - 결과 출력하는 함수 
*/

public class QuizEx6 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("이름을 입력하세요");
		String name = input1();
		int kor = 0;
		int eng = 0;
		int com = 0;
		
		System.out.print("국어점수 입력 : ");
		kor = input2();
		System.out.print("영어점수 입력 : ");
		eng = input2();
		System.out.print("전산점수 입력 : ");
		com = input2();
		
		
		int total = total(kor, eng, com);
		double avg = average(total);
		char grade = grade(avg);
		
		output(name, kor, eng, com, total, avg, grade);
		
	}

	// input() : input name and score of subjects
	// @ input name
	public static String input1() {
		String name = sc.nextLine();
		return name;
	}
	// @ input subject and score
	public static int input2() {
		int score = sc.nextInt();
		return score;
	}

	// total(~) : calculate total score

	public static int total(int x, int y, int z) {
		int sum = x + y + z;
		return sum;
	}

	// average(~) : calculate average
	public static double average(int x) {
		double avg = x / 3.0;
		return avg;
	}

	// grade(~) : grade
	public static char grade(double x) {
		char gr = 0;
		switch ((int)(x / 10)) {
		case 9:
			gr = 'A';
			return gr;
		case 8:
			gr = 'B';
			return gr;
		case 7:
			gr = 'C';
			return gr;
		case 6:
			gr = 'D';
			return gr;
		default:
			gr = 'F';
			return gr;
		}
	}

	// output() : print
	public static void output(String s1, int x, int y, int z, int a, double b, char ch1) {
		System.out.println(s1 + "님의 성적표 *****");
		System.out.println("국어 : " + x + ", 영어 : " + y + ", 전산 : " + z);
		System.out.printf("총점 : %d, 평균 : %.2f", a, b);
		System.out.println(", 학점 : " + ch1);
		System.out.println();
	}
}
