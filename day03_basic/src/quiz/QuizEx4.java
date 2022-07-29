package quiz;

import java.lang.*;	// 자동 임포트 해준다.

// 문제] 성적처리 프로그램 만들기
public class QuizEx4 {
	public static void main(String[] args) {
		int kor = 90, eng = 88, com = 100, total = 0;
		double avg = 0;
		total = kor + eng + com;
		avg = total / 3.0;	//total을 형변환하는 것보다 3을 double로 만들기
		String name = "이도연";
		
		System.out.println(name + " 님의 성적표***");
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f\n", total, avg);		// 소숫점 자리수 표기법 %m.nf
	}
}


/*
	result :
	이도연 님의 성적표****
	국어 : 90, 영어 : 88, 전산 : 100
	총점 : 278, 평균 : 59.33
*/