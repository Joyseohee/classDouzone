package quiz;

import java.util.Scanner;

public class Quiz001 {
	public static void main(String[] args) {
		System.out.println("숫자 3개를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		int max = x > y ? (x > z ? x : z) : (y > z ? y : z);
		int min = x < y ? (x < z ? x : z) : (y < z ? y : z);
		int mid = x == min || x == max ? (y == min || y == max ? z : y) : x;
		
		System.out.println(max + " > " + mid + " > " + min);
	}
	 
}
