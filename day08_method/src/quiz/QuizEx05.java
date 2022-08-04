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

public class QuizEx05 {
	private static Scanner sc = new Scanner(System.in);
	private static String name = "";
	private static int kor = 0;
	private static int eng = 0;
	private static int com = 0;
	private static int total = 0;
	private static double avg = 0;
	private static char grade = 0;

	public static void main(String[] args) {
		input1();
		input2();
		total();
		average();
		grade();
		output();
	}

	// input() : input name and score of subjects
	// @ input name
	public static String input1() {
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		return name;
	}
	// @ input subject and score
	public static void input2() {
		while (true) {
			do {
				System.out.println("국어 성적을 입력하세요");
				kor = sc.nextInt();
			} while (kor < 0 || kor > 100);
			break;
		}

		
		while (true) {
			do {
				System.out.println("영어 성적을 입력하세요");
				eng = sc.nextInt();
			} while (eng < 0 || eng > 100);
			break;
		}

		
		while (true) {
			do {
				System.out.println("전산 성적을 입력하세요");
				com = sc.nextInt();
			} while (com < 0 || com > 100);
			break;
		}
	}

	// total(~) : calculate the total score
	public static int total() {
		total = kor + eng + com;
		return total;
	}

	// average(~) : calculate the average
	public static double average() {
		avg = total / 3.0;
		return avg;
	}

	// grade(~) : allocate the grade
	public static char grade() {
		grade = 0;
		switch ((int)(avg / 10)) {
		case 9:
			grade = 'A';
			return grade;
		case 8:
			grade = 'B';
			return grade;
		case 7:
			grade = 'C';
			return grade;
		case 6:
			grade = 'D';
			return grade;
		default:
			grade = 'F';
			return grade;
		}
	}

	// output() : print 
	public static void output() {
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);
		System.out.println(", 학점 : " + grade);
		System.out.println();
	}
}
