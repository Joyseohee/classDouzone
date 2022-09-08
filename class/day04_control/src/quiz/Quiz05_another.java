// 문제3] 전산, 영어, 국어 점수 입력 받아서 평균 60점 이상이고, 각 과목 과락이 40점 이하면 과목 불합격 처리하는 프로그램 


package quiz;

import java.util.Scanner;

public class Quiz05_another {
	public static void main(String[] args) {
		
		System.out.println("전산, 영어, 국어 점수를 차례로 입력하세요.(공백 두고)");
		Scanner sc = new Scanner(System.in);
		int com = sc.nextInt();
		int eng = sc.nextInt();
		int kor = sc.nextInt();
		
		int total = com + eng + kor;
		double avg = total / 3.0 ;
		boolean result = false;
		
		if (avg < 60) {
			result = false;
		} else {
			if (com < 40 || eng < 40 || kor < 40) result = false;
			else result = true;
		} 
		
		if (result = true) System.out.println("합격입니다.");
		else System.out.println("합격입니다.");
		
		

	}
}
