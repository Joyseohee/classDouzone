



//*
package quiz;
import java.util.Scanner;
public class QuizGrade {
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = new Scanner(System.in).nextLine();
		System.out.println("국어 성적을 입력하세요");
		int kor = new Scanner(System.in).nextInt();
		System.out.println("영어 성적을 입력하세요");
		int eng = new Scanner(System.in).nextInt();
		System.out.println("전산 성적을 입력하세요");
		int com = new Scanner(System.in).nextInt();
		
		int total = kor + eng + com;
		double avg = total / 3.0;
		
		String grade = null;
		
		if(avg >= 90) grade = "A";
		else if(avg >= 80) grade = "B";
		else if(avg >= 70) grade = "C";
		else if(avg >= 60) grade = "D";
		else grade = "F";
		
		
		
		// 학점 평점 구하기
		
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
		System.out.printf("총점 : %d, 평균 : %.2f", total, avg);			// 대입은 printf로 대입하는 변수 마지막에 몰아서 표기
		System.out.println(", 학점 : " + grade);
		
		
		
	}
}
//*/