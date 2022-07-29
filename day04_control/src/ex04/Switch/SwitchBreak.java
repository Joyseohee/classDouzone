package ex04.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는?(1~3점) input : ");

		int point = new Scanner(System.in).nextInt();
//		double point = new Scanner(System.in).nextDouble();
//		int point2 = (int)point;

		switch (point) {
		case 1: // 숫자, '문자', "문자열"
			System.out.println("집");
//			break;
		case 2: // 숫자, '문자', "문자열"
			System.out.println("피아노");
//			break;
		case 3: // 숫자, '문자', "문자열"
			System.out.println("우산");
//			break;
		}
		
		System.out.println(" 상품에 당첨되셨습니다. 축하합니다!");
	}
}
