package ex02.If;

import java.util.Scanner;

/* 제어문 : 프로그램의 실행 순서를 제어한다.
- 비교문
	if ~ else

- 선택문
	switch ~ case

- 반복문
	for문
	for ~ each문
	while문
	do ~ while문
 
- 기타 구문
	break
	continue
//*/

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("integer data : ");
		int su = new Scanner(System.in).nextInt();
		if( su % 2 == 0) {
			System.out.println(su + " ===> even");
		}
		
		System.out.println("===================");
		
		if( su % 2 == 0) {
			System.out.println(su + " ===> even");
		} else {
			System.out.println(su + " ===> odd");
		}
		
		
	}
}
