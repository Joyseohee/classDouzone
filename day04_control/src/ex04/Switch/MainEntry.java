package ex04.Switch;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는?(1~3점) input : ");

//		int point = new Scanner(System.in).nextInt();
		double point = new Scanner(System.in).nextDouble();
//		int point2 = (int)point;

		switch ((int)point) {
		case 1: // 숫자, '문자', "문자열"
			System.out.println("포인트 점수 1점입니다.");
//			break;
		case 2: // 숫자, '문자', "문자열"
			System.out.println("포인트 점수 2점입니다.");
//			break;
		case 3: // 숫자, '문자', "문자열"
			System.out.println("포인트 점수 3점입니다.");
//			break;

		default:
			System.out.println("없는 점수 입니다. 1~3까지만 입력하세요.");

		}
	}
}
