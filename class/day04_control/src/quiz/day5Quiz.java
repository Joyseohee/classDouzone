/* 문제1] 숫자 1개 입력 받아서 짝/홀수 판정 P/G
 */

package quiz;

import java.util.Scanner;

public class day5Quiz {
	public static void main(String[] args) {
		System.out.println("숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch (x % 2) {
		case 1:
			System.out.println("홀수");
			break;
		case 0:
			System.out.println("짝수");
			break;
		}
	}
}
