package ex04.arrayMethod;

import java.util.Scanner;

public class Quiz_ScoreEx2 {
	
	public static void main(String[] args) {
		System.out.println("=========성적 처리 프로그램=========\n");
		input();
	}

	public static void input() {
		Scanner s = new Scanner(System.in);
		int kor, eng, math;
		String name = null;
		
		while (true) {
			System.out.println("\n###########[성적 입력]###########\n");
			System.out.print("##[학생 이름] : ");
			name = s.next();
			System.out.print("##[국어 점수] : ");
			kor = s.nextInt();
			System.out.print("##[영어 점수] : ");
			eng = s.nextInt();
			System.out.print("##[전산 점수] : ");
			math = s.nextInt();
			if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100) {
				System.out.println("\n##Error!! 점수를 제대로 입력하세요 (0 ~ 100)\n");
				continue;
			} else
				break;
		} //while end
		
		process(name, kor, eng, math);
	} //input() end

	public static void process(String name, int kor, int eng, int math) {
		
		int sum = kor + eng + math;
		double avg = sum /  3.0;
		//double avg = (kor + eng + math) / (double) 3;
		
		System.out.println("\n#############[결 과]#############\n");
		System.out.println("[이 름] : " + name);
		System.out.println("kor : " + kor + "\teng : "+eng + "\tmath : " + math);
		System.out.print("[총 점] : " + sum);
		System.out.printf("[평 균] : %.2f  ", avg);

		grade(avg);
	} // process(n, k, e,m) end

	public static void grade(double avg) {
		char grade = ' ';

		if (avg <= 100 && avg > 90) {
			grade = 'A';
		} else if (avg <= 90 && avg > 80) {
			grade = 'B';
		} else if (avg <= 80 && avg > 70) {
			grade = 'C';
		} else if (avg <= 70 && avg > 60) {
			grade = 'D';
		} else
			grade = 'F';
		System.out.println("[학 점] : " + grade);
	}
}
