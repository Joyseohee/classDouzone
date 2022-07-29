package quiz;

import java.util.Scanner;

// 윤년/평년 판정 프로그램 작성
/*
 * if ( 년도 % 4 == 0 )
 * 		if (( 년도 % 100 != 0 ) \\ ( 년도 %400 == 0 ))
 * 
 */

public class IfQuiz {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		String result = null;
		boolean flag = false;

//		if (y % 4 == 0 && (y % 100 != 0) || (y % 400 == 0)) {
//				flag = true;
//		}
		
		
		if (y % 4 == 0) {
			if ((y % 100 != 0) || (y % 400 == 0)) {
				flag = true;
			}
		}
		result = (flag == true) ? "윤년" : "평년";
		System.out.println("\n\n"+ y + " 년도 ===> " + result);

	}
}






/*
public class IfQuiz {
	public static void main(String[] args) {
		System.out.println("년도를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();

		if (y % 4 == 0) {
			if ((y % 100 != 0) || (y % 400 == 0)) {
				System.out.printf("%d년은 윤년입니다\n", y);
			} else {
				System.out.printf("%d년은 윤년이 아닙니다\n", y);
			}
		} else {
			System.out.printf("%d년은 윤년이 아닙니다\n", y);
		}

	}
}
//*/