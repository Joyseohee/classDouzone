



//*
package quiz;
import java.util.Scanner;
public class QuizScore {
	public static void main(String[] args) {
		int kor = 0, eng = 0, com = 0, total = 0;
		double avg = 0;
		String name = null;
		
//		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		name = new Scanner(System.in).nextLine();
		System.out.println("국어 성적을 입력하세요");
		kor = new Scanner(System.in).nextInt();
		System.out.println("영어 성적을 입력하세요");
		eng = new Scanner(System.in).nextInt();
		System.out.println("전산 성적을 입력하세요");
		com = new Scanner(System.in).nextInt();
		
		total = kor + eng + com;
		avg = total / 3.0;
		
		System.out.println(name + "님의 성적표 *****");
		System.out.println("국어 : " + kor + ", 영어 : " + eng + ", 전산 : " + com);
		System.out.printf("총점 : %d , 평균 : %.2f", total, avg);			// 대입은 printf로 대입하는 변수 마지막에 몰아서 표기
	}
}
//*/