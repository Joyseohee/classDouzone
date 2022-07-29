package day04_basic;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int check_year=sc.nextInt();
		if((check_year%4==0 && check_year%100!=0)||(check_year%400==0)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
	}

}
