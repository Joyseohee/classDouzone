
//*
package quiz;

import java.util.Scanner;

public class ScoreSwitch {
	private static Scanner scanner;

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		System.out.println("국어 성적을 입력하세요");
		int kor = scanner.nextInt();
		System.out.println("영어 성적을 입력하세요");
		int eng = scanner.nextInt();
		System.out.println("전산 성적을 입력하세요");
		int com = scanner.nextInt();
		
		int total = kor + eng + com;
		double avg = total / 3.0;
		
		String grade = null;
		
//		if(avg >= 90) grade = "A";
//		else if(avg >= 80) grade = "B";
//		else if(avg >= 70) grade = "C";
//		else if(avg >= 60) grade = "D";
//		else grade = "F";
//		
		switch((int)avg/10) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
			break;
		}
		// 학점 평점 구하기
		
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);			// 대입은 printf로 대입하는 변수 마지막에 몰아서 표기
		System.out.println(", 학점 : " + grade);
		
	}
}
//*/