package quiz;

import java.util.Scanner;

/* 문제1
 * 숫자 3개 입력 받아서 큰 수 출력하는 프로그램 작성
 * 논리 연산, 교환 알고리즘, if 이용
 * 같은 수가 들어오는 경우는 제외
 * ai.edu.kingsmile@gmail.com으로 제출
 */

public class Quiz02 {
	public static void main(String[] args) {
		System.out.println("숫자 3개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
	
// 논리 연산
//*	
		int max = x > y ? (x > z ? x : z) : (y > z ? y : z);		// 제일 큰 수
		int min = x < y ? (x < z ? x : z) : (y < z ? y : z);		// 제일 작은 수
		int mid = x == min || x == max ? (y != min && y != max ? y : z) : z ;
		System.out.println(max + " > " + mid + " > " + min);
		
//*/
	}
}
// 교환 알고리즘
/*
		int temp1 = x > y ? x : y;						// 
		int temp2 = temp1 > z ? temp1 : z ;				//
		if(temp1 != temp2) { 
			if(x > y) System.out.println(z + " > " + x  + " > " + y);
			if(x < y) System.out.println(z + " > " + y  + " > " + x);
		} else {
			if(x > y) {
				
				System.out.println(x + " > " + y  + " > " + z);
			}
				
			if(x < y) System.out.println(y + " > " + x  + " > " + z);
		}
			
//*/
	
// if문
/* 
		
		if(x > y) {
			if(x > z) System.out.println(x);
			else System.out.println(z);
		} else {
			if(y > z) System.out.println(y);
			else System.out.println(z);
		}
//*/

