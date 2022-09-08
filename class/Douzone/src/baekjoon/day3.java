//
//
//
///*
//첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
//*/
//
//package baekjoon;
//
//import java.util.Scanner;
//
//public class day3 {
//
//	public static void main(String[] args) {
//    	Scanner in = new Scanner(System.in);
//		int A = in.nextInt();
//		int B = in.nextInt(); 	
//    	
//		int c1 = A * (B % 10);
//		int c2 = A * (B / 10 - ((B / 100) * 10));
//		int c3 = A * (B / 100);
//		int c4 = A * B;
//		
//		System.out.println(c1);
//		System.out.println(c2);
//		System.out.println(c3);
//		System.out.println(c4);	
//
//	}
//
//}


package baekjoon;

import java.util.*;

	public class day3 {
	
		interface Main {
			static void main(String[]z)	{
				Scanner s = new Scanner(System.in);
				int a = s.nextInt(), b = s.nextInt();
				System.out.print(b % 10 * a + " " + b / 10 % 10 * a + " " + b / 100 * a + " " + a * b);
			}
		}
	}
