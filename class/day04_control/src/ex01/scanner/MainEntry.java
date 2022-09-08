package ex01.scanner;


import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {

		
		
		Scanner sc = new Scanner(System.in);	// 객체 생성, 메모리 할당, 생성자 함수 자동 호출
		System.out.println("integer, double, char data inpu ==> ");
		int x = sc.nextInt();
		double y = sc.nextDouble();
		char ch = sc.next().charAt(2);
		System.out.println(x + ", " + y + ", " + ch);
		
//		System.out.println("input : ");
//		int i = sc.nextInt();
//		String name = sc.next();
////		String str = sc.next();
//		System.out.println(i + ", " + name);
		
		
		

/*
		int x = 9;
		System.out.println("정수를 입력하세요.");
		int y = sc.nextInt();
		System.out.println("단어를 입력하세요.");

		String[] w = new String[y];
		// y만큼 단어를 입력받기
		for(int i = 0; i < y; i++) {
			String c = sc.next();
			w[i] = c;
			
		}
		for(int i = 0; i < w.length; i++) {
			System.out.print(w[i]);
			if(i < (w.length - 1)) {
				System.out.print(", ");
			}
		}
//*/	
		
		//		System.out.println(c); 
//		char[] w = new char[y];
////		
//		for(i = 0; i < )
//		w = 
		
//		System.out.println(x + y);
//		System.out.println(w);
	}
	
}
