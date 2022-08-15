package ex03.oop;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Employee em = new Employee();
		Scanner sc = new Scanner(System.in);
		
		Employee[] mm = new Employee[2]; 

		for (int i = 0; i < mm.length; i++) {
			mm[i] = new Employee();
			mm[i].input();
		}
		
		for (int i = 0; i < mm.length; i++) {
			mm[i] = new Employee();
			mm[i].print();
		}
	}
}
