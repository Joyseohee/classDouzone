package quiz.one;

import java.util.Scanner;

public class SungJuk {
	
	// @ method1 : input score
	public void intput() {
		int kor, com, eng;
		int[] arr = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		String[] subject = {"국어" + "영어" + "전산"};
		for (int i = 0; i < subject.length; i++) {
			System.out.println(subject[i] + " 성적을 입력하세요.");
			arr[i] = sc.nextInt();
		}
	}
	
	// @ method2 : calculate and print
	public void process(int kor, int com, int eng) {
		int total = kor + com + eng;
		double avg = total / 3.0;
		char grade = '0';
		
		switch((int)avg/10) {
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
			grade = 'F';
			break;
		}
		
		toString();
		
	}

	@Override
	public String toString() {
		return "SungJuk [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
