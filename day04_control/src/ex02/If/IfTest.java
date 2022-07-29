package ex02.If;

import java.util.Scanner;


public class IfTest {
	public static void main(String[] args) {
		
		System.out.println("integer data : ");
		int su = new Scanner(System.in).nextInt();
		
		// 다중 if문 : if문으로 양수/음수/0 판정
		if(su > 0) {
			System.out.println("양수");
		} else if (su < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		} // end if
		
	}
}


			//	else if (su < 0) {
			//	System.out.println("음수");
			////} else {
			//	System.out.println("0");