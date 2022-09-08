// 문제3] 전산, 영어, 국어 점수 입력 받아서 평균 60점 이상이고, 각 과목 과락이 40점 이하면 과목 불합격 처리하는 프로그램 


package quiz;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		
		System.out.println("전산, 영어, 국어 점수를 차례로 입력하세요.(공백 두고)");
		Scanner sc = new Scanner(System.in);
		int com = sc.nextInt();
		int eng = sc.nextInt();
		int kor = sc.nextInt();
		
		int total = com + eng + kor;
		double avg = total / 3.0 ;
		String result = null;
		
		if (avg >= 60 && (com > 40 && eng > 40 && kor > 40)) {
			result = "합격입니다.";
		} else { 
			if (com < 40 || eng < 40 || kor < 40) {
				System.out.println("평균 60점은 넘었지만");
				if (com < 40) result = "전산 과목 과락으로 불합격입니다.";
				if (eng < 40) result = "영어 과목 과락으로 불합격입니다.";
				if (kor < 40) result = "국어 과목 과락으로 불합격입니다.";
			} else result = "평균 60점 미만으로 불합격입니다.";
		} 

		System.out.println(result);

	}
}
