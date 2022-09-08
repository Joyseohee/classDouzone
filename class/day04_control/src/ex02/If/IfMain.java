package ex02.If;

import java.util.Scanner;

public class IfMain {
public static void main(String[] args) {
		
		System.out.println("integer data : ");
		int su = new Scanner(System.in).nextInt();
		
		if (su == 0) {
			System.out.println(su + "===> 0입니다");
		} else if(su % 2 == 0) {
			System.out.println(su + " ====> 짝수");
			if(su > 0) {
				System.out.println("양수");
			} else if (su < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println(su + " ====> 음수");
			if(su > 0) {
				System.out.println("양수");
			} else if (su < 0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
			
		}
		
	}

}
