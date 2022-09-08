package ex01.array;

import java.util.Scanner;

public class MainEntrty {
	public static void main(String[] args) {
		// 1
		char[] ch; // declare array
		ch = new char[4]; // create array and allocate in Memory
		
		// 2
		char[] ch2 = new char[4];	// declare and create array, It can`t be created with empty status.
		// Initialize the array
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[1]);
		System.out.println("-------------");

		for (int i = 0; i < ch2.length; i++) {	//'(name of array).length' : this field counts length of array.
			System.out.println("ch2[" + i + "] = " + ch2[i]);
		}
		System.out.println("-------------");
/*	
		int Num = new Scanner(System.in).nextInt();
		char[] ch3 = new char[Num];
		
		for (int i = 0; i < Num; i++) {
			ch3[i] = (char)(66+i);
			System.out.println("ch3[" + i + "] = " + ch3[i]);
		}
//*/
		// 3 declare and Initialize at once
		char[] ch4 = {'J', 'A', 'V', 'A'};
		System.out.println("length of array = " + ch4.length);
		for (int i = 0; i < ch4.length; i++) {
			System.out.println("ch4[" + i + "] = " + ch4[i]);
		}
		System.out.println("-------------");
		
		String[] str1 = {"a", "kbs", "Park", "D"};
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		System.out.println("-------------");
		
		String[] str2 = new String[] {"a", "kbs", "Park", "D"};	// Doesn`t matter with addition.
		for (int i = 0; i < str2.length; i++) {
			System.out.println(str2[i]);
		}
		System.out.println("str2[2] = " + str2[2]);
		System.out.println("str2[" + (str2.length - 1) + "] = " + str2[str2.length - 1]);
	}
}
