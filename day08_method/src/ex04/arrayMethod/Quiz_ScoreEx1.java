package ex04.arrayMethod;

import java.util.Scanner;

public class Quiz_ScoreEx1 {
	
	public static String strName = " ";
	public static int nKor = 0;
	public static int nEng = 0;
	public static int nCom = 0;

	public static void main(String[] args) {
		Info_Input();
		Proc();
	}

	public static void Info_Input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력 하세요:");
		strName = sc.next();
		System.out.println("0~100까지의 점수를 입력 하세요");
		do {
			System.out.print("국어점수 입력:");
			nKor = sc.nextInt();
		}while(nKor < 0 || nKor > 100);
		
		
		do {
			System.out.print("영어점수 입력:");
			nEng = sc.nextInt();
		}while(nEng < 0 || nEng > 100);
		
		do {
			System.out.print("전산점수 입력:");
			nCom = sc.nextInt();
		}while(nCom < 0 || nCom > 100);
		
		//Sum(nKor, nEng, nCom);
		
	} //Info_Input() end

	public static int Sum(int nkor, int neng, int ncom) {
		int hap = nkor + neng + ncom;
		return hap;
	}

	public static double Avg(int nSum, int nCnt) {
		return (double) (nSum / nCnt);
	}

	public static void Proc() {
		int nSum = Sum(nKor, nEng, nCom); //전역(스태틱)변수로 되어 있어서
		double fAvg = Avg(nSum, 3);
		char szGrade = Grade(fAvg);

		System.out.println("\n\n학생이름 : " + strName);
		System.out.println("Kor : " + nKor + "\tEng : " + nEng + "\tCom : " + nCom);
		System.out.print("[ 총점 : " + nSum + " ]" + "[ 평균 : " + fAvg + " ]");
		System.out.println("[ 학점 : " + szGrade + " ]");
	}

	public static char Grade(double fAvg) {
		switch ((int) fAvg / 10) {
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}
}
