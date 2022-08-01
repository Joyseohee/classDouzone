
//*
package ex09.break_Continue;

import java.util.Scanner;

public class ScoreSwitch2 {
	private static Scanner scanner;

	public static void main(String[] args) {
//		char flag = ' ';
		String flag = "";
			
		while (true) {
	//		Scanner sc = new Scanner(System.in);
			System.out.println("이름을 입력하세요");
			scanner = new Scanner(System.in);
			String name = scanner.nextLine();
	
			// Score : insert int with 0~100
			int kor = 0, eng = 0, com = 0;
	/*
			while (true) {
				do {
					System.out.println("국어, 영어, 전산 성적을 차례로 입력하세요");
					kor = scanner.nextInt(); eng = scanner.nextInt(); com = scanner.nextInt();
					if (kor < 0 || kor > 100) System.out.println("국어 성적이 잘못됐습니다. 다시 입력하세요.");
					if (eng < 0 || eng > 100) System.out.println("영어 성적이 잘못됐습니다. 다시 입력하세요.");
					if (com < 0 || com > 100) System.out.println("전산 성적이 잘못됐습니다. 다시 입력하세요.");
					System.out.println();
				} while (kor < 0 || kor > 100 || eng < 0 || eng > 100 || com < 0 || com > 100);
				break;
			}
	//*/
			
			//*
			while (true) {
				
				do {
					System.out.println("국어 성적을 입력하세요");
					kor = scanner.nextInt();
				} while (kor < 0 || kor > 100);
				break;
			}
	
			
			while (true) {
				do {
					System.out.println("영어 성적을 입력하세요");
					eng = scanner.nextInt();
				} while (eng < 0 || eng > 100);
				break;
			}
	
			
			while (true) {
				do {
					System.out.println("전산 성적을 입력하세요");
					com = scanner.nextInt();
				} while (com < 0 || com > 100);
				break;
			}
			//*/
	
			int total = kor + eng + com;
			double avg = total / 3.0;
	
			String grade = null;
	
			// caculate avg
	
	//		if(avg >= 90) grade = "A";
	//		else if(avg >= 80) grade = "B";
	//		else if(avg >= 70) grade = "C";
	//		else if(avg >= 60) grade = "D";
	//		else grade = "F";
	//		
			switch ((int) avg / 10) {
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
			System.out.printf("총점 : %d, 평균 : %.2f", total, avg); // 대입은 printf로 대입하는 변수 마지막에 몰아서 표기
			System.out.println(", 학점 : " + grade);
			System.out.println();
			System.out.println("Would you like to insert more information?");
//			flag = scanner.next().charAt(0);
//			if (flag == 'n' || flag == 'N') break;
			flag = scanner.next();
//			if (flag.equals("n") || flag.equals("n") ) break;
//			if (flag.equalsIgnoreCase("n") ) break;				// 대소문자 구분 없음
//			if (flag.toUpperCase().equals("N")) break;			// 대문자로 바꿔
			if (flag.toLowerCase().equals("n")) break;			// 문자로 바꿔
			
		}
	}
}
//*/